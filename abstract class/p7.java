abstract class RBI{
		abstract void interest();
		void weeklyOff(){
		System.out.println("sat-sun off");
	}
}
class Axis extends RBI{
		void interest(){
		System.out.println("10");
	}
}
class HDFC extends RBI{
		void interest(){
		System.out.println("12");		
		}
		void weeklyOff(){
		System.out.println("sat-sun off");		
		}
}
class Demo{
		public static void main(String[]args){
		System.out.println("Axis data: ");
		Axis a= new Axis();
		a.interest();
		a.weeklyOff();

		System.out.println("HDFC data :");
		HDFC h=new HDFC();
		h.interest();
		h.weeklyOff();
		}
}
//output:Axis data:
10
sat-sun off
HDFC data :
12
sat-sun off//