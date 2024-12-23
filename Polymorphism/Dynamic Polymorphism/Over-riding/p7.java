class Parent{
		void education(){
		System.out.println("Engineering");
		}
}
class Child extends Parent{
		void education(){
		System.out.println("Engineering sodun sagl...");
		}
		void flat(){
		System.out.println("pune");
		}
}
class Demo{
		public static void main(String[]args){
		Parent p=new Child();
		p.education();
		p.flate();
		}
}
\\output=Enginering sodun sagl\\