interface A{
		int a=10;
		}
interface B{
		int a=20;
		}
class Child implements A,B{
		void fun(){
		System.out.println(a);
		}
}
class Demo{
		public static void main(String[]args){
		Child c =new Child();
		c.fun();
		}
}
\\output: error: reference to a is ambiguous
                System.out.println(a);\\