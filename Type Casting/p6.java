class Emp{
		void fun(){
		System.out.println("Emp");
		}
}
class Dev extends Emp{
		void gun(){
		System.out.println("Dev");
		}
}
class Demo{
		public static void main(String[]args){
		Emp e=new Dev();
		e.fun();
		Dev obj=(Dev)e;
		obj.fun();
		obj.gun();
		}
}
//output=Emp
// 	 Emp
//	 Dev