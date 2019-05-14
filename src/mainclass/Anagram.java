class Anagram
{
	public static void main(String[] args)
	{
		String s1 ="Cat";
		String s2 = "Act";
     		if(s1.length()==s2.length())
		{
			String s1Low = s1.toLowerCase();
			String s1Low = s1.toLowerCase();
 			int sum1=0;
			int sum2=0;
			for(int i = 0;i<s1Low.length();i++)
			{
				sum1 += s1Low[i];
				sum2 += s2Low[i];	
			}
			if(sum1==sum2)
			{
				System.out.println("It is anagram");
			}
			else
 			{
				System.out.println("It is not anagram");
			}
		}
		else
		{
				System.out.println("It is anagram");
		}			
	}
}