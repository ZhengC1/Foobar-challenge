import java.util.*;
public class challenge3{
	public static void main(String[] args)
	{
		int x = 2;
		int num = 0;
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		int i = 0;
		int summing = 0;
		while(Math.pow(3,i) < x)
		{ 
			i++;
			nums.add((int)Math.pow(3,i));
			num = (int)Math.pow(3,i);
			summing = summing + num;	
			System.out.println(num);
		}
		summing =  1 + summing -(int) Math.pow(3,i);
		int sum = summing;
		int size = nums.size();
		if((sum + x) < num)
		{ num = num/3;
			size = size -1;
		}
		int left = x;
		int right = num; 
		int thing = num;
		Integer[] array = nums.toArray(new Integer[nums.size()]);
		String[] answer = new String[size];
		for(int k = 0; k < answer.length;k++)
		{
			answer[k] = "-";
			if(array[k] == thing)
			{
				array[k] = 0;
				answer[k] = "R";	
				System.out.println("I HOPE THIS SHOWS UP" +answer[k]);
			}
			System.out.println(array[k]);
			int moose = 0;
			int here = 0; 
			int ca = 0;

			int accum = 0;
			for(int c = 0;array[c] < k; c++)
			{
				accum = accum + array[c];
			}
			System.out.println("this is the accum " + accum);
			for(int j = 0; j < array.length; j++)
			{

				if(add(left,right) <= array[j] && accum >= add(left, right))
				{
					moose = array[j];
					here = j;	
					array[j] = 0;
					break;
				} 	
				if(accum < add(left,right) && array[j] > add(left, right))
				{
					left = left + array[j];
					answer[j] = "L";
					array[j] = 0;
				}
		}
			if(left > right)
			{
				right = right + moose; 
				answer[here] = "R";

				//		System.out.println("right: " + right);
			}
			else 
			{
				left = left + moose; 
				answer[here] = "L";
				//		System.out.println("left: " + left);
			}
		}

		System.out.println("this is the left " + left +" and the right " + right);
		for(int a = 0; a < answer.length;a++)
		{
			System.out.println(answer[a]);
		}
	}
	public static int add(int left, int right)
	{
		int added = 0; 
		if(left > right)
		{
			added = left - right;	
		}
		else if(right > left)
		{
			added = right - left;
		}		 
		else
		{
			return added;
		}
		return added;
	}
}

