abstract class Car{
		private String model;
		private String colour;
	Car(String model,String colour){
		this.model=model;
		this.colour=colour;
	}
	void fuel(){
	System.out.println("petrol");	
		}
	String getModel(){
	return model;
	}
	String getcolour(){
		return colour;
	}
	abstract void design();
}
class Merc extends car{
		Merc(String model,String colour){
		super(model,colour);
}
		void design(){
		System.out.println("Sedan");
		}
		void fuel(){
		System.out.println("disel");
}
}
class Demo{
		public static void main(String[]args){
		Merc obj=new Merc("520d","white");
		System.out.println("Merc feature:  ");
		System.out.println("obj.getmodel()");
		System.out.println("obj.getcolour()");
		obj.fuel();
		obj.design();
		System.out.println("================================");
		System.out.println("Alto feature:  ");
		Alto obj1=new Alto("k10","black");
		System.out.println("obj.getmodel()");
		System.out.println("obj.modelcolour()");
		obj.fuel();
		obj.design();
		}
}


		
