class Codex{
		void fun(){
		System.out.println(a);
		}
}
class Jankalyuan {
		void gun(){
		Codex obj=new Codex();
		System.out.println("in gun:"+obj.a);
		}
}
class Demo{
		public static void main(String[]args){
		Codex obj=new Codex();
		obj.fun();
		Jankalyan obj1=new Jankalyan();
		obj1.gun();
		}
}