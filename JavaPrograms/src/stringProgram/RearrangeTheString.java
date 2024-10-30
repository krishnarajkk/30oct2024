package stringProgram;

public class RearrangeTheString {
	public static void main(String args[]) {
		String s="This is Indian Cricket Team";
		String r="";
		
		   String[] b=s.split(" ");
		   
		   r=b[4]+" "+b[3]+" "+b[1]+" "+b[0]+" "+b[2];
		   
		   System.out.println(r);
	}

}
