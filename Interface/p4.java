interface Car{
		void fuel();
		void design();
		}
class Merc implements Car{
		public void fuel(){
		System.out.println("petrol");
		}
		public void design(){
		System.out.println("disel");
		}
}
class Demo{
		public static void main(String[]args){
		Merc obj =new Merc();
		obj.fuel();
		obj.design();
		}
}
\\output=petrol
disel\\