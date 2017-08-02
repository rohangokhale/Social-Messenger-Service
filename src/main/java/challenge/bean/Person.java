package challenge.bean;


public class Person{
	private int id;
	private String handle;
	private String name;

	public Person(){
	}

	public Person(int id, String handle, String name){
		this.id = id;
		this.handle = handle;
		this.name = name;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getHandle(){
		return handle;
	}
	public void setHandle(String handle){
		this.handle = handle;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}