class Parent{
		void property(){
		System.out.println("Sanskar");
		}
}
class Child{
		void education(){
		System.out.println("Engineering");
		}
}
class Demo{
		public static void main (String[]args){
		Child obj=new Child();
		obj.property();
		obj.education();
		}
}
//output=: error: cannot find symbol
//                obj.property();	