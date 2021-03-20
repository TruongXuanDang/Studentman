package a2_123456789.studentman;

public class Student implements Document, Comparable {
	private int id;
	private String name;
	private String phone;
	private String address;
	
	@Override
	public String toHtmlDoc() {
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

	public Student(int id, String name, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Student() {
		super();
	};
	
	
}
