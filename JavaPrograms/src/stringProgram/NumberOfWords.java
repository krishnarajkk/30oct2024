package stringProgram;

public class NumberOfWords {

	public static void main(String[] args) {
		
		String str="India is My Country India is Big";
		int count=1;
		
	// Approach 1      int count=str.split(" ").length;
	      
	  //    System.out.println("The number of words present in the given String:" + " " + count);
		
		  for(int i=0;i<=str.length()-1;i++)
		  {
		  if( str.charAt(i)==' ' && str.charAt(i+1)!=' ')
		   count++;
		  }
		
		  System.out.println("The number of words present in the given String:" + " " + count);
	}
}


 