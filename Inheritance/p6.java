class Country{
		int a=20;
		void flag(){
		System.out.println("tricolour");
		}
}
class Maha extends Country{
		void language(){
		System.out.println("marathi+hindi");
		}
}
class Goa extends Country{
		void language(){
		System.out.println("english");
	}
}
class Demo{
		public static void main(String[]args){
		System.out.println("Maha lang and flag");	
		Maha obj=new Maha();
		obj.flag();
		obj.language();
		System.out.println("Goa lang and flag");
		Goa obj1=new Goa();
		obj1.flag();
		obj1.language();
	}
}
	
//output:Maha lang and flag
tricolour
marathi+hindi
Goa lang and flag
tricolour
english//