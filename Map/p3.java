
import java.util.*;
class Demo{
		public static void main(String[]args){
		HashMap<String,String>hm=new HashMap<String,String>();
		hm.put("Viraj","koli");
		hm.put("Rohit","varma");
		hm.put("Rohit","Sharma");
		System.out.println("All keys: ");
		for(String s:hm.keySet()){
		System.out.println(s);
		}
		for(Map.Entry<String,String>entry:hm.entrySet()){				
		System.out.println(entry.getKey()+"value is: "+entry.getValue());
		}
	}
}