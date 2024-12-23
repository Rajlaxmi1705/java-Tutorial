class Codex{
		void fun(int a){
		System.out.println("in fun");
		}
		void fun(){
		System.out.println("in fun 2");
		}
}
class Demo{
		public static void main(String[]args){
		Codex c=new Codex();
		c.fun();
		}
}
\\output=in fun 2\\