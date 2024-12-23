import java.util.*;
class Demo{
		public static void main(String[]args){
		LinkedList ls=new LinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		System.out.println("Using listiterator");
		ListIterator itr=ls.listIterator();
		ListIterator itr1=ls.listIterator();
		System.out.println(itr);
		System.out.println(itr1);
		}
}
//output:Using listiterator
java.util.LinkedList$ListItr@279f2327
java.util.LinkedList$ListItr@2ff4acd0