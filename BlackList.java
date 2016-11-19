import java.util.*;

public class BlackList
{
	static Set blackList = new HashSet();

	static
	{
		blackList.add("idiot");
		blackList.add("BadWord_1");
		blackList.add("BadWord_2");
		blackList.add("BadWord_3");
		blackList.add("BadWord_4");
		blackList.add("BadWord_5");
	}
	
	public static void main(String args[])
	{
		String statement = "John Joe is an idiot .";
		if(hasBlackListWord(statement))
		{
			System.out.println("Can't Print a Bad Words bcoz it has BlackListed.");
		}
	}
	
	public static boolean hasBlackListWord(String str)
	{
		String[] words = str.split(" ");
		
		for(String word : words)
		{
			if(blackList.contains(word))
			{
				return true;
			}
		}	
		return false;
	}
}
