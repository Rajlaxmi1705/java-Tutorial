interface Creditcard {
		void interest();
		void limit();
}
class HDFC implements Creditcard{
		public void interest(){
		System.out.println("12%");
		}
			public void limit(){
		System.out.println("20lakh");
		}
}
class Axis implements Creditcard{
		public void interest(){
		System.out.println("10%");
		}
		public void limit(){
		System.out.println("18 lakh");
		}
}
class Demo{
		public static void main(String[]args){
		HDFC obj=new HDFC();
		obj.interest();
		obj.limit();
		
		System.out.println("====================");
		Axis obj1=new Axis();
		obj1.interest();
		obj1.limit();
		}
}
\\output=12%
20lakh
====================
10%
18 lakh
\\