import java.util.*;

public class List
{
	public static void main(String args[])
	{
		AbstractList<Integer> array = new ArrayList<Integer>();
		AbstractList<Integer> ll = new LinkedList<Integer>();
		
		for(int i=0; i<=50000; i++)
		{
			array.add(i);
			ll.add(i);
		}
		long startTimearr = new java.util.Date().getTime();
		display(array);
		long endTimearr = new java.util.Date().getTime();
		
		long startTimell = new java.util.Date().getTime();
		display(ll);
		long endTimell = new java.util.Date().getTime();
		
		System.out.println("Time Tacken By Array_List :: " + (endTimearr - startTimearr)/1000 + " : Seconds...!!!! )");  // Devide by 1000 bcz Its in MiliSeconds
		System.out.println("Time Tacken By Linked_List :: " + (endTimell - startTimell)/1000 + " : Seconds...!!!! )");  // Devide by 1000 bcz Its in MiliSeconds
		
	}
		
	public static void display(AbstractList list)
	{
		for(int i=0; i<=50000; i++)
		{
			System.out.println(list.get(i));
		}
	}
}