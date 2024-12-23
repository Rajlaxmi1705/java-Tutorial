class Demo{
		public static void main(String[]args){
		Codex chavi=new Codex();
		chavi.fan();
		}
}
class Codex{
		int chairs;
		String name;
		void fan(){
		int a=10;
		System.out.println("fan started :"+a);
		System.out.println("fan started:"+chairs);
		System.out.println("fan started:"+name);
		}
}
//output:fan started :10
fan started:0
fan started:null