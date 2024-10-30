package stringProgram;

public class ExtractEachCharacter {
	
	public static void main(String[] args) {
		
		String str="Alphabet!@#%  &65 67325 456TEST";
		
		int num=0; 
		int let=0;
		int special=0;
		int space=0;
		
		for(char ch:str.toCharArray())
		{
			if(Character.isLetter(ch))
			 let++;
			else if(Character.isWhitespace(ch))
				space++;
			else if(Character.isDigit(ch))
				num++;
			else
				special++;
		}
		
		System.out.println("Total No of Letters is present in the given String:" + " " + let);
		System.out.println("Total No of Numbers is present in the given String:" + " " + num);
		System.out.println("Total No of SpecialCharacter is present in the given String:" + " " + special);
		System.out.println("Total No of WhiteSpaces is present in the given String:" + " " + space);
		
	}

}
