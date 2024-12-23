class Country{
		int a=20;
		}
class Maha extends Country{
		void language(){
		System.out.println(a);
		}
}
class Demo{
	public static void main (String[]args){
	System.out.println("Maha lang & flag");
	Maha obj=new Maha();
	obj.language();
	}
}
//output=Maha lang & flag
20//