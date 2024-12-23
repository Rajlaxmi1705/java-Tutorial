abstract class Parent{
		abstract void education();
		void career(){
		System.out.println("bussiness");
	}
}
class Child extends Parent{
		void education(){
		System.out.println("Degree");
		}
		void career(){
		System.out.println("gov job");
		}
}
class Child1 extends Parent{
		void education(){
		System.out.println("12th");
		}
}
class Demo{
		public static void main(String[]args){
		System.out.println("Child data:");
		Child c=new Child();
		c.education();
		c.career();
		
		System.out.println("Child1 data:");
		Child1 c1=new Child1();
		c1.education();
		c1.career();
		}
}
//output=Child data:
Degree
gov job
Child1 data:
12th
bussiness//
