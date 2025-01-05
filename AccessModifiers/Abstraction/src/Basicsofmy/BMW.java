package Basicsofmy;

public abstract class BMW {

	void commonfunc(){
		
		System.out.println("Inside CommonFunc Method");
	}
	
	abstract void acclerate();
	
	abstract void brake();
	
	public static void main(String[] args) {
		System.out.println("Inside The Main Method");
	}
	
}
