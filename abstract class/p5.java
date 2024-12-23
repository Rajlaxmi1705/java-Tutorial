abstract class Parent{
		abstract void Marry();
		}
class Child extends Parent{
		void Marry(){
		System.out.println("X...");
		}
}
class Demo{
		public static void main(String[]args){	
		Child c=new Child();
		c.Marry();
  		}
}	
output=X...