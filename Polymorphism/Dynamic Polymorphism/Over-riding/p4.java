class Parent{
		void education(){
		System.out.println("Engineering");
		}
}
class Child extends Parent{
		void education(int a){
		System.out.println("Engineering sodun sagl..");
		}
}
class Demo{
		public static void main(String[]args){
		Child c=new Child();
		c.education();
		}
}
\\output=Engineering\\