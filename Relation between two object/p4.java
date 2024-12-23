class Parent{
		void property(){
		System.out.println("Sanskar");
		}
}
class Child extends Parent{
		void education(){
		System.out.println("engineering");
		}
}
class Demo{
		public static void main(String[]args){
		Child obj=new Child();
		System.out.println("Child property: ");
		obj.property();
		obj.education();

		System.out.println("Parent property");
		Parent p=new Parent();
		p.property();
		}
}
//output:Child property:
Sanskar
engineering
Parent property
Sanskar
