class Country{
		int a=20;
		
		void flag(){
		System.out.println("Tri-colour");
		}
}
class Maharastra extends Country{
		void language(){
		System.out.println("marathi+hindi");
		}
}
class Goa extends Country{
		void language(){
		System.out.println("English");
		}
}
class Demo{
		public static void main(String[]args){
		System.out.println("Maharastra lang and flag: ");
		Maharastra obj=new Maharastra();
		obj.language();
		obj.flag();
		System.out.println("Goa lang and Flag: ");
		Goa obj1=new Goa();
		obj1.language();
		obj1.flag();
		}
}
//output:Maharastra lang and flag:
	marathi+hindi
	Tri-colour
	Goa lang and Flag:
	English
	Tri-colour