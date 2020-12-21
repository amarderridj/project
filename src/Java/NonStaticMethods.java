package Java;

public class NonStaticMethods {

	public static void main(String[] args) {
		// To call the non-static method Add and Sub. we have to create the object of the class
		
		NonStaticMethods obj = new NonStaticMethods();
		obj.Add(2, 4);
		int z=obj.Sub(4, 2);
		System.out.println(z);

	}
		// The Add method helps us to print the Sum of any two int values
		public void Add(int x, int y) {
			int z= x+y;
			System.out.println("the addition of "+x+" and "+y+" = "+z );
		}
		
		// The Sum method helps us to return the substraction of any 2 int values
		public int Sub (int x, int y) {
			System.out.print("The substration of "+x+" and "+y+" = ");
			return x-y;
		}
}/*This model has a set of standards, a project lifecycle, a dependency management system, 
and logic for executing plugin goals at certain phases in the lifecycle process. 
There is a file that is stored with an .XML extension called POM.XML file that has the
 minimum amount of information required.  The file has a groupId, 
an artifactId, and a version.*/
