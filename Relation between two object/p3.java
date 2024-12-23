class Parent{
		int a=20;
		void property(){
		System.out.println("Sanskar");
		}
}
class Child extends Parent{
		void education(){
		System.out.println("Engineering"+a);
		}
}
class Demo{
		public static void main(String[]args){
		Child obj=new Child();
		obj.property();
		obj.education();
		}
}
//output=Sanskar
/ Engineering20
		