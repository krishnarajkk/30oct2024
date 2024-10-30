package stringProgram;

public class CountWords {
	public static void main(String[] args) {
	
		String s="India is Biggest Country is India Country India";
		
		int i=0;
		
		String[] b=s.split(" ");
		
		for(String x:b)
		{
			if(x.equals("India"))
			{
				i++;
			}
		}
		
		System.out.println("No of India word is repeated:"+" "+i);
	}

}
