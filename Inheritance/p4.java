class Parent{
	int a=20;
	void property() {
	System.out.println("sanskar");
	}
}
class Child extends Parent{
		void education(){
		System.out.println("education:+a");	
		}
}
class Demo{
	public static void main(String[]args){
	Child Obj=new Child();
	System.out.println("Child property");
	Obj.property();
	Obj.education();
			
	System.out.println("Parent property");
	Parent P=new Parent();
	P.property();
}
}
//output=Child property
sanskar
education:+a
Parent property
sanskar