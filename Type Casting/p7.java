class Emp{
		void fun(){
		System.out.println("in fun");
		}		
}
class Dev extends Emp{
		void code(){
		System.out.println("coding");
		}
}
class Manager extends Emp{
		void manage(){
		System.out.println("manage");
		}
}
class HR extends Emp{
			void rangoli(){
			System.out.println("useless job");
			}
}
class Codex{
		void display(Emp obj){
		Manager m=(Manager)obj;
		m.fun();
		m.manage();
		}
}
class Demo{
		public static void main(String[]args){
		Manager m=new Manager();
		Dev d=new Dev();
		Codex obj=new Codex();
		obj.display(m);
		}
}	
//output=in fun
//       manage		