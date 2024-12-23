class One{
		int x;
		Two t;
		
		One(Two t){
		this.t=t;
		x=10;
		}
		void display(){
		System.out.println("Ones x:"+x);
			}
}
class Two{
		int y;
		Two(int y){
		this.y=y;
		}
		void display(){
		System.out.println("Two y;"+y);
		}
}
class Demo{
		public static void main(String[]args){
		Two obj2=new Two(22);
		One obj1=new One(obj2);
		obj1.display();
		}
}
//output:Ones x:10