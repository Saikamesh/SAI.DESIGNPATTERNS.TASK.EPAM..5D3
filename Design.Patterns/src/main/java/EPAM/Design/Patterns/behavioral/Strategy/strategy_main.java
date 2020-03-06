package EPAM.Design.Patterns.behavioral.Strategy;
import java.util.Scanner;
public class strategy_main {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 1st Number :");
	float number1=s.nextFloat();
	System.out.println("Enter 2nd Number :");
	float number2=s.nextFloat();
	operation_type optype=new operation_type(new addition());
	System.out.println("Addition ="+optype.execute_operation(number1, number2));
	optype=new operation_type(new subtraction());
	System.out.println("Subtraction ="+optype.execute_operation(number1, number2));
	optype=new operation_type(new multiplication());
	System.out.println("Multiplication ="+optype.execute_operation(number1, number2));
	s.close();
}
}
