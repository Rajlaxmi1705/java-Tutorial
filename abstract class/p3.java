abstract class Parent{
		abstract void Marry();
		}
class Demo{
		public static void main(String[]args){
		Parent p=new Parent();
		p.Marry();
		}
}
output=: error: Parent is abstract; cannot be instantiated
                Parent p=new Parent();