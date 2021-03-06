package a2_123456789.studentman;

public class UndergradStudent extends Student {
	private int id;
	private String name;
	private String phone;
	private String address;
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}

	
	
	public UndergradStudent(int id, String name, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}



	public UndergradStudent() {
		super();
	}



	@Override
	public String toHtmlDoc() {
		// TODO Auto-generated method stub
		return "<html>\n" + "<head><title>" + 
				"Student: " + this.id + "-" + this.name + "</title></head>\n" +
		          "<body>\n" + 
		          this.id+ " " + this.name + " " + this.phone + " " + this.address + 
		          "</body>\n" + "</html>";
	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
