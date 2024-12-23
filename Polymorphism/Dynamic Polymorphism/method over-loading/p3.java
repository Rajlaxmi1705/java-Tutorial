class Codex{
		void fun(int a){
		System.out.println("in fun"+a);
		}
		void fun(char a){
		System.out.println("in fun 2"+a);
		}
}
class Demo{
		public static void main(String[]args){
		Codex c=new Codex();
		c.fun(10);
		}
}
\\output=in fun10\\
			