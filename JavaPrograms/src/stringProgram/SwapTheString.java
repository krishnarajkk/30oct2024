package stringProgram;

public class SwapTheString {
	
	public static void main(String[] args)
	{
		String s="Krishnaraj";
		String b="ViratKholi";
		String temp;
		
		temp=s;
		s=b;
		b=temp;
		//s=s+b;
		
		//b=s.substring(0,s.length()-b.length());
		//s=s.substring(b.length());
		
		System.out.println(s);
		System.out.println(b);
		
	}

}
