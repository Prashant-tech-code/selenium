package prashant.mavenpractice;

public class AllRunner {
	
	    public static void main(String[] args) {
	        System.out.println("🚀 Starting AllRunner Execution...\n");

	        try {
	            System.out.println("===== Running Google.java =====");
	            Google.main(args);
	            System.out.println("===== Google.java Finished =====\n");

	            System.out.println("===== Running ReverseString.java =====");
	            ReverseString.main(args);
	            System.out.println("===== ReverseString.java Finished =====\n");
	            
	            System.out.println("===== Running HighestNO.java =====");
	            HighestNO.main(args);
	            System.out.println("===== HighestNO.java Finished =====\n");
	            

	            System.out.println("✅ All classes executed successfully!");
	        } catch (Exception e) {
	            System.out.println("❌ Error while running one of the classes: " + e.getMessage());
	            e.printStackTrace();
	        }

	        System.out.flush();
	    }
	}



