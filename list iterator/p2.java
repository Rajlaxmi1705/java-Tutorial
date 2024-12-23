import java.util.*;
class Demo{
		public static void main(String[]args){
		LinkedList ls=new LinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		System.out.println("using listiterator");
		ListIterator itr = ls.listIterator();
		Listeiterator itr1=ls.listIterator();
		while(itr1.hasPrevious()){
		System.out.println(itr.Previous());
		}
	}
}
//output=: error: cannot find symbol
                Listeiterator itr1=ls.listIterator();
                ^