class Parent{
		void marry(){
		System.out.println("xyz...");
		}
		void education(){
		System.out.println("Engineering");
		}
}
class Child extends Parent{
		void education(){
		System.out.println("Engineering sodun sagl...");
				}
}
class Child1 extends Parent{
		void marry(){
		System.out.println("x..");
		}
}
class Demo{
		public static void main(String[]args){
		Child c=new Child();
		c.marry();
		c.education();
		
		System.out.println("================");
		Child1 c1=new Child1();
		c1.marry();
		c1.education();
		}
}
\\output=xyz...
Engineering sodun sagl...
================
x..
Engineering\\