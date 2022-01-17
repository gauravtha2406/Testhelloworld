import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	
	// Taking Input from the user
	System.out.println("Enter the First Number");
	Double number1=sc.nextDouble();
	System.out.println("Enter the Second Number");
	Double number2=sc.nextDouble();
	
	// User choice for arithmetic operation
	System.out.println("Select the operator : +,-,*, or /");
	char operator=sc.next().charAt(0);
	
	// Various cases for particular user choice 
	switch(operator) {
		case '+':
			System.out.println("Addition of numbers is "+(number1+number2));
			break;
		case '-':
			System.out.println("Substraction of numbers is "+(number1-number2));
			break;
	
		case '*':
			System.out.println("Multiplication of numbers is "+(number1*number2));
			break;
		case '/':
			if(number2==0) { // Checking for any invalid division operation
				System.out.println("Invalid denominator Value");
				break;
			}
			else {
			System.out.println("Division of numbers is "+(number1/number2));
			break;
			}
	}
	sc.close();
	System.out.println("Calculator closed");
	
	}
}
