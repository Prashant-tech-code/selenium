package prashant.mavenpractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Prashant";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--) {
			
			b+= a.charAt(i);
		}
		System.out.println(b);

	}

	

}
