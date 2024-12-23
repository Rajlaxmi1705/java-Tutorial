class parent{
	void property(){
	System.out.println("Sanskar");
	}
}
class Child{
	void education(){
	System.out.println(engineering);
	}
}
class Demo{
	public static void main(String[]args){
	child obj= new Child();
	obj.property();
	obj.education();
	}
}
// o/p:error: cannot find symbol
        System.out.println(engineering);
                           ^
  symbol:   variable engineering
  location: class Child