package calculateobject;

public class CalculateObject {
    public static void main(String[] args) {
	CalculateObject calculateObject = new CalculateObject();
	calculateObject.addition(1,2);
	calculateObject.subtraction(3, 2);
	calculateObject.multiplication(2, 3);
	calculateObject.division(6, 3);
	
	calculateObject.addition(1.2,2.3);
	calculateObject.subtraction(3.4, 2.6);
	calculateObject.multiplication(2.7, 3.1);
	calculateObject.division(6.5, 3.2);
	
    }
    
    public void addition(int a, int b) {
	System.out.println(a + b);
    }
    
    public void subtraction(int a, int b) {
	System.out.println(a - b);
    }
    
    public void multiplication(int a, int b) {
	System.out.println(a * b);
    }
    
    public void division(int a, int b) {
	System.out.println(a / b);
    }
    
    public void addition(double a, double b) {
	System.out.println(a + b);
    }
    
    public void subtraction(double a, double b) {
	System.out.println(a - b);
    }
    
    public void multiplication(double a, double b) {
	System.out.println(a * b);
    }
    
    public void division(double a, double b) {
	System.out.println(a / b);
    }
    
}
