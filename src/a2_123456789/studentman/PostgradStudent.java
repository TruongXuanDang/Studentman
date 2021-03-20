package a2_123456789.studentman;

public class PostgradStudent extends Student {
	private int id;
	private String name;
	private String phone;
	private String address;
	private int gpa;
	
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

	
	
	public int getGpa() {
		return gpa;
	}



	public void setGpa(int gpa) {
		this.gpa = gpa;
	}



	public PostgradStudent(int id, String name, String phone, String address, int gpa) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.gpa = gpa;
	}



	public PostgradStudent() {
		super();
	}



	@Override
	public String toHtmlDoc() {
		// TODO Auto-generated method stub
		return "<html>\n" + "<head><title>" + 
		"Student: " + this.id + "-" + this.name + "</title></head>\n" +
          "<body>\n" + 
          this.id+ " " + this.name + " " + this.phone + " " + this.address + " " + this.gpa + 
          "</body>\n" + "</html>";
	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
