

# Getting Started


To quickly run the project on the command line, head to the root folder and enter:
gradlew bootRun
to start the application. You can then access the endpoints at http://localhost:8080/endpointname.
Example: http://localhost:8080/mymessages	username: superman password: superman
The preferred way to play around with the application is with Postman. For the basic authentication
field, use username:superman and password:superman.



# API


### getMessages
Endpoint to get the user's timeline, made up of messages authored by the people they follow as well as authored by themselves.

##### URL

/mymessages

##### Method:

GET

##### URL Params

Required: none

Optional: searchTerm - to enable filtering of messages that contain the searchTerm

##### Success Response:

Code: 200 

Content: { id : id, personId : personId, content : content }...{ id : id, personId : personId, content : content }
This will be a list of messages, with the message's id, id of the author, and content of the message.

##### Error Response:

Code: 401 UNAUTHORIZED 

Content: {"timestamp":1500306594978,"status":401,"error":"Unauthorized","message":"Bad credentials","path":"/mymessages"}

##### Sample Curl Call:

curl -i -u superman:superman http://localhost:8080/mymessages?search=Krypton

##### Notes:

_____________
getFollowers
Get the people that are following the user, as well as the people the user is following

URL
/followers

Method:
GET

URL Params
Required: none
Optional: none

Success Response:
Code: 200 
Content: {followers: [{id:id, handle:handle, name:name},...{id:id, handle:handle, name:name}],
		{following: [{id:id, handle:handle, name:name},...{id:id, handle:handle, name:name}]

Error Response:
Code: 401 UNAUTHORIZED 
Content: {"timestamp":1500306594978,"status":401,"error":"Unauthorized","message":"Bad credentials","path":"/mymessages"}

Sample Call:
curl -i -u superman:superman http://localhost:8080/followers

Notes:

_____________
follow
add a new follower-followee relationship

URL
/followers

Method:
POST

URL Params

Required: userToFollow=[handle of user to follow]
Optional: none

Success Response:
Code: 200 
Content: {user is now following userToFollow}

Error Response:
Code: 401 UNAUTHORIZED 
Content: {"timestamp":1500306594978,"status":401,"error":"Unauthorized","message":"Bad credentials","path":"/mymessages"}
OR
CODE: 412 PRECONDITION FAILED
Content: {"Error: A user is trying to add themself as their own follower"}

Sample Call:
curl -i -u superman:superman -d "userToFollow=batman" http://localhost:8080/followers
Notes:

________
unfollow
Removes a follower-followee relationship

URL
/followers

Method:
DELETE

URL Params
Required:
userToUnfollow=[handle of user to unfollow]
Optional: none

Success Response:
Code: 200 
Content: { userHandle is no longer following userToUnfollowHandle}

Error Response:
Code: 401 UNAUTHORIZED 
Content: {"timestamp":1500306594978,"status":401,"error":"Unauthorized","message":"Bad credentials","path":"/mymessages"}

Sample Call:
curl -i -u superman:superman -X DELETE "http://localhost:8080/followers?userToUnfollow=batman"

Notes:

_________
getMostPopularFollowersData
Gets the most popular follower(s) (multiple if tied) for each user in the database.

URL
/mostpopularfollowers

Method:
GET

URL Params
Required: none
Optional: none

Success Response:

<What should the status code be on success and is there any returned data? This is useful when people need to to know what their callbacks should expect!>

Code: 200 
Content: [{userId:userId, userHandle:userHandle, userName:userName, mostPopFollowerId:id, mostPopFollowerHandle:handle, mostPopFollowerName:name},...{userId:userId, userHandle:userHandle, userName:userName, mostPopFollowerId:id, mostPopFollowerHandle:handle, mostPopFollowerName:name}]

Error Response:
Code: 401 UNAUTHORIZED 
Content: {"timestamp":1500306594978,"status":401,"error":"Unauthorized","message":"Bad credentials","path":"/mymessages"}

<Just a sample call to your endpoint in a runnable format ($.ajax call or a curl request) - this makes life easier and more predictable.>

Notes:
'Most popular' is measured by the number of followers a user has. If a user has two followers that are tied for most popular, both are returned.
