package EPAM.Design.Patterns.behavioral.Strategy;

public class operation_type {
private operation op;
public operation_type(operation op) {
	 this.op=op;
}
public float execute_operation(float n1,float n2) {
	return op.calculate(n1,n2);
}
}
