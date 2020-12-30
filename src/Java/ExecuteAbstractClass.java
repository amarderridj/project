package Java;

public class ExecuteAbstractClass extends AbstractClass{

	public static void main(String[] args) {
		ExecuteAbstractClass.Addition(2, 6);
		
	// Lets's create the object of the class in order to call these methods
		ExecuteAbstractClass obj = new ExecuteAbstractClass();
		obj.Sub();
		obj.Mult();
		obj.Div();
	}
	@Override
	public void Sub() {
		System.out.println("this is Subtraction method");	
	}
	@Override
	public void Mult() {
		System.out.println("this is Multiplication method");	
	}
	@Override
	public void Div() {
		System.out.println("this is Division method");	
	}
}
