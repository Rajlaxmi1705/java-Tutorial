abstract class Parent{
		abstract void Marry();
		}
class Child extends Parent{
          }

class Demo{
		public static void main(String[]args){
		Child c=new Child ();
		c.Marry();
		}
}
//output=: error: Child is not abstract and does not override abstract method Marry() in Parent
class Child extends Parent