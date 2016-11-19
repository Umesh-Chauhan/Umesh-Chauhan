import java.util.*;
import java.io.*;

class Hashmap{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		
		Map<String,String> myMap = new HashMap<String,String>(); 
		
        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = in.next();
            
            //myMap.put("Hi", "Bye");	// Adds ("Hi","Bye") mapping to myMap
			myMap.put(name, phone);	// Adds ("Hi","Bye") mapping to myMap
			
			//myMap.put("Hi", "Bye!"); // Replaces "Bye" mapping from "Hi" with "Bye!" 
			//System.out.println(myMap.get("Hi")); // Print the Value mapped to from "Hi"
            
            // Write code here
        }
		
        while(in.hasNext()){
            String s = in.next();
            // Write code here
			
			if(myMap.containsKey(s))
			{
				System.out.println( s + "=" + myMap.get(s)); // Print the Value mapped to from "Hi"
			}
			
			else
			{
				System.out.println("Not found"); 
			}
        }
        in.close();
    }
}