class University{
		int a=20;
		void syllabus(){
		System.out.println("java Syllabus");
		}
}
class College extends University{
		void department(){
		System.out.println("AI");
		}
}
class Demo{
		public static void main(String[]args){
		System.out.println("clg Sylllabus");
		College obj=new College();
		obj.syllabus();
		System.out.println("University Syllabus ");
		University obj1=new University();
		obj1.syllabus();
		}
}

//output=clg Sylllabus
java Syllabus
University Syllabus
java Syllabus


