class Parent{
		int balance;
		Parent(int balance){
		this.balance=balance;
	}
	void property(){
	System.out.println("bank balance:"+ balance);
		}
}
class Child extends Parent{

}
class Demo{
	public static void main (String[]args){
	Child c=new Child();
	c.property();
	}
}
output: constructor Parent in class Parent cannot be applied to given types;
class Child extends Parent{
^
  required: int
  found:    no arguments
  reason: actual and formal argument lists differ in length