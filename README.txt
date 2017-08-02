Welcome to my submission for the ThousandEyes coding challenge!

Please see API.txt for full documentation of the different endpoints and methods. Included with each
endpoint is a sample call you can make using curl to play around with the API.

I made a few changes to the database schema, the most notable being the addition of a password field
in the 'people' table. This is to enable basic authentication (the username and password sent in the
header are checked against the 'handle' and 'password' fields of people table in the database). Each
user currently has their password equal to their handle. Also, all handles must be unique.

I chose to implement the second extra feature, an endpoint that returns a list of all users, paired
with their most popular follower. The notes for that endpoint in API.txt provide details for how 
that feature was implemented. 

Running the Application
To quickly run the project on the command line, head to the root folder and enter:
gradlew bootRun
to start the application. You can then access the endpoints at http://localhost:8080/endpointname.
Example: http://localhost:8080/mymessages	username: superman password: superman
The preferred way to play around with the application is with Postman. For the basic authentication
field, use username:superman and password:superman.

Please feel free to reach out if you have any questions for me about the code! I look forward to
speaking with you soon.

Email: rohangokhale@gmail.com
Phone: (908) 268-7532
