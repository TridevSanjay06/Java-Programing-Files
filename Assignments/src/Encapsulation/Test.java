package Encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Patient p = new Patient();
		
		p.setId(10);
		p.setName("Sanjay");
		p.setSsn("jan");
		
		
		System.out.println("Id : "+p.getId());
		System.out.println("Name : "+p.getName());
		System.out.println("SSC : "+p.getSsn());
	}

}
