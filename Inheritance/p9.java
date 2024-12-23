class Country{
		int a=20;
		}
class Maha extends Country{
		void language(){
		System.out.println(a);
		}
}
class Demo{
	public static void main(String[]args){
	Country obj1=new Country();
	obj1.language();
	}
}
//output: error: cannot find symbol
        obj1.language();//