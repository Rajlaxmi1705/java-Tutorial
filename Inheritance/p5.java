class University{
		int a=20;
		void syllabus(){
		System.out.println("java Syllabus");
		}
   }
class College extends University{
		void department(){
		System.out.println(" AI");
		}
}
class Demo{
		public static void main(String[]args){
		System.out.println("clg sylllabus");
		College obj=new College();
		obj.syllabus();
		System.out.println("University syllabus");
		University obj1 = new University();
		obj.syllabus();
 }
	}
*/ output:clg sylllabus
java Syllabus
University syllabus
java Syllabus
*/