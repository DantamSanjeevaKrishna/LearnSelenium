package interviewPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Sanjeev";
		String s1="Chandu";
		s=s+s1;
		//String s3=s1;
		s1=s.substring(0,s.length()-s1.length());
		s=s.substring(s.length());
		System.out.println(s1);
		System.out.println(s);
		
		//System.out.println(s3.substring(length));
		
		
		
		
		

	}

}
