import java.util.*;
public class challenge2{

    public static void main(String[] args){
	String[] x = {"something", "gnihtemos", "cat", "dog", "tac", "god"};

        int len = x.length;

        int count = 0;

        Set<String> set = new HashSet<String>();
	//you get the set here
        for(int i = 0;i < len; i++)
        {

            set.add(x[i]);

        }
	//now how to remove the palindromes.
	String[] array = set.toArray(new String[set.size()]);
	for(int i = 0; i < array.length;i++)
	{
	    for(int j = i + 1;j < array.length;j++)
	    {
		if(isPalindrome(array[i],array[j]))
		{
			count++;
		}	
            }
	}
        System.out.println(array.length - count);
    }

    public static boolean isPalindrome(String cat, String dog)
    {
	if(cat.length() == dog.length())
	{
	int length = dog.length() - 1;
        for(int i = 0; i < cat.length();i++)
        {
            if(cat.charAt(i) != dog.charAt(length))
	    {
		return false;
	    }
	    length--;
        }
	return true;
	}
        return false;
    }
}
