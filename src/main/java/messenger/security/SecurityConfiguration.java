package messenger.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import javax.sql.DataSource;

import org.springframework.security.web.context.support.*;
@Configuration
@EnableAutoConfiguration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	

	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{
		PasswordEncoder encoder = new Encoder();
		
		auth.jdbcAuthentication().dataSource(dataSource)
			//.passwordEncoder(encoder)
			.usersByUsernameQuery("SELECT handle, password, enabled FROM people WHERE handle=?")
			.authoritiesByUsernameQuery("SELECT handle, 'ROLE_USER' FROM people WHERE handle=?");
	}

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/h2-console/*").permitAll()
            .anyRequest().authenticated();

        //added following line to enable basic authentication
        http.httpBasic();
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}