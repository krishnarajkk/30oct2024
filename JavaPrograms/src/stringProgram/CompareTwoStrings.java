package stringProgram;

import java.util.HashSet;

public class CompareTwoStrings {
	
	public static void main(String[] args)
	{
		String s="Rahulo";
		
		String b="Lion";
		
		boolean flag=true;
		
		HashSet<Character> set=new HashSet<Character>();
		
		HashSet<Character> set2= new HashSet<Character>();
		
		for(  char c: s.toCharArray())
		{
	      set.add(c);
		}
		
		for ( char c:b.toCharArray())
		{
			if(set.contains(c))
			{
				set2.add(c);
				flag=false;
			}
		}
		
		for(Character d: set2)
		{
			System.out.print(d);
		}
		if(flag==true)
		{
			System.out.println("No Common Character found");
		}
	}

}
