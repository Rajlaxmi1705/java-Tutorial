abstract class Parent{
		abstract void marry();
		void education(){
		System.out.println("engine...");
		}
}
class Child extends Parent{
		void marry(){
			System.out.println("X...");
		}
		void education(){
		System.out.println("doctor");
		}
}
class Child1 extends Parent{
		void marry(){
		System.out.println("xyz...");
		}
}
class Demo{
	  public static void main(String[]args){
		Child c=new Child();
		c.marry();
		c.education();
			
		Child1 c1= new Child1();
		c1.marry();
		c1.education();
		}
}
//output=Axis data:
10
sat-sun off
HDFC data:
12
sun off//
		
