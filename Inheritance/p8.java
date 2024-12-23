class Country{
		int a=20;
	}
class Maha extends Country{
		int a=10;
	void language(){
	System.out.println(this.a);
	System.out.println(super.a);
	}
}
class Demo{
		public static void main(String[]args){
		System.out.println("Maha lang & flag");
		Maha obj=new Maha();
		obj.language();
		}
}
//output=Maha lang & flag
10
20//