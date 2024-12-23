class Parent{
		void education(){
		System.out.println("Engineering...");
		}
}
class Child extends Parent{
		int education(){
		System.out.println("engineering");
		 return 10;
		}
}
class Demo{
		public static void main(String[]args){
		Child c=new Child();
		c.education();
		}
}
\\output= education() in Child cannot override education() in Parent
                int education(){
                    ^\\
		