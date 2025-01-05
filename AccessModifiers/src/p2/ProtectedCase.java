package p2;
import Basics.AllModifiers;

public class ProtectedCase extends AllModifiers {

	public static void main(String args []) {
			 
		AllModifiers Object = new AllModifiers();
		
		System.out.println(Object.c);
		
		ProtectedCase pObject = new ProtectedCase();
		
		System.out.println(pObject.d);//D : Protected
		
		System.out.println(pObject.c);//C : Public

	}
}
