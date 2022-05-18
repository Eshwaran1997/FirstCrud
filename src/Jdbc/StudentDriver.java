package Jdbc;

public class StudentDriver {
	
	public static void main(String[] args) {
		Student s =new Student();
		StudentData data =new StudentData();
		s.setId(12);
		s.setName("Eshwaran");
		s.setAddress("banglore");
		s.setEmail("eshu@gmail");
		data.saveStudent(s );
		
		
		
		
		
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

}
