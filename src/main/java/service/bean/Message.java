package service.bean;


public class Message{
	private int id;
	private int personId;
	private String content;

	public Message(){
	}

	public Message(int id, int personId, String content){
		this.id = id;
		this.personId = personId;
		this.content = content;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getPersonId(){
		return personId;
	}
	public void setPersonId(int personId){
		this.personId = personId;
	}
	public String getContent(){
		return content;
	}
	public void setContent(String content){
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Messages [id=" + id + ", personID=" + personId + ", content=" + content + "]";
	}
}