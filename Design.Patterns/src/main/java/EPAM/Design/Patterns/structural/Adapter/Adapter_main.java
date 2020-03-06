package EPAM.Design.Patterns.structural.Adapter;

public class Adapter_main {
public static void main(String[] args)
{
	creditcard cc=new bankcustomer();
	cc.givedetails();
	System.out.println(cc.getcreditcard());
}
}
