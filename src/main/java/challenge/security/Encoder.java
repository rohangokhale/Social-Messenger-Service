package challenge.security;
import org.springframework.security.crypto.password.*;

public class Encoder implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		
		return(rawPassword+"123");
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// TODO Auto-generated method stub
		if(encodedPassword.equals(rawPassword+"123"))
			return true;
		else
			return false;
				
	}
	
	
	
	

}
