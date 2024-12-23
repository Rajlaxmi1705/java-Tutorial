import java.util.*;
class Demo{
		public static void main(String[]args){
		LinkedList<String>ls=new LinkedList<String>();
		ls.add("A");
		ls.add("B");
		ls.add("c");
		System.out.println("using listiterator");
		ListIterator itr=ls.listIterator();
		System.out.println(itr.hasPrevious());
		}
}
//output:using listiterator
//false