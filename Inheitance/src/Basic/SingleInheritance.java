package Basic;

public class SingleInheritance {

	void m1() {
		System.out.println("inside m1");
	}
	
	public static void main(String[] args) {
		
		SingleInheritance s = new SingleInheritance();
		
		s.m1();
		s.hashCode();
		s.getClass();
		
	}
}