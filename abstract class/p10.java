abstract class Car{
		void fuel(){
		System.out.println("petrol");
		}
	abstract void design();
		}
class Merc extends Car{
		void design(){
		System.out.println("SUV");
	}
}
class Alto extends Car{
		void design(){
		System.out.println("Sedan");
	}
		void fuel(){
		System.out.println("disel");
		}
}
class Demo{
		public static void main(String[]args){
		Merc obj=new Merc();
		System.out.println("Merc Feature: ");
		obj.fuel();
		obj.design();
		System.out.println("=====================");
		System.out.println("Alto feature: ");
		Alto obj1=new Alto();
		obj1.fuel();
		obj1.design();
		}
}
//output=Merc Feature:
petrol
SUV
=====================
Alto feature:
disel
Sedan//