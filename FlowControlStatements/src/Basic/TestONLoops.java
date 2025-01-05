package Basic;

	public class TestONLoops {
		
		public static void main(String[] args) {
			

	        int n = 150;
	        // For Loop

	        for (int i = 1; i <= n; i++) {

	           


	            if (i % 10 == 0) {

	                continue;

	            }

	            if (i > 100) {

	                break;

	            }

	            System.out.println(i);

	        }
	        // While Loop

	        int i = 1;

	        while (i <= n) {

	            if (i % 10 == 0) {

	                i++;

	                continue;

	            }

	            if (i > 100) {

	                break;

	            }

	            System.out.println(i++);

	        }

	        i = 1;

	        do {

	            if (i % 10 == 0) {

	                i++;

	                continue;

	            }

	            if (i > 100) {

	                break;

	            }

	            System.out.println(i++);

	        } while (i <= n);

	}
}
		
