package service.bean;


/*
 * Data structure to store a user's information along with the information of their
 * most popular follower, and the follower's popularity.
 */
public class MostPopularFollowerByUser{
	
	@Override
	public String toString() {
		return "MostPopularFollowerByUser [userId=" + userId + ", userHandle=" + userHandle + ", userName=" + userName
				+ ", followerId=" + followerId + ", followerHandle=" + followerHandle + ", followerName=" + followerName
				+ ", popularity=" + popularity + "]";
	}

	private int userId;
	private String userHandle;
	private String userName;
	private int followerId;
	private String followerHandle;
	private String followerName;
	private int popularity;

	public MostPopularFollowerByUser(){
	}
	
	public MostPopularFollowerByUser(int userId, String userHandle, String userName, int followerId,
			String followerHandle, String followerName, int popularity) {
		super();
		this.userId = userId;
		this.userHandle = userHandle;
		this.userName = userName;
		this.followerId = followerId;
		this.followerHandle = followerHandle;
		this.followerName = followerName;
		this.popularity = popularity;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserHandle() {
		return userHandle;
	}

	public void setUserHandle(String userHandle) {
		this.userHandle = userHandle;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getFollowerId() {
		return followerId;
	}

	public void setFollowerId(int followerId) {
		this.followerId = followerId;
	}

	public String getFollowerHandle() {
		return followerHandle;
	}

	public void setFollowerHandle(String followerHandle) {
		this.followerHandle = followerHandle;
	}

	public String getFollowerName() {
		return followerName;
	}

	public void setFollowerName(String followerName) {
		this.followerName = followerName;
	}

	public int getPopularity() {
		return popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}


}