package EPAM.Design.Patterns.creational.Factory;

import java.util.Scanner;

public class Factory_main {
public static void main(String[] args)
{
	System.out.println("Select plan :\n 1.localplan \n 2.enterpriseplan \n 3.bussinessplan\n =============");
	Scanner s=new Scanner(System.in);
	getplan gp= new getplan();  
	      System.out.print("Enter the name of plan for which the bill will be generated: "); 
	      String planName=s.nextLine();  
	      System.out.print("Enter the number of units for bill will be calculated: ");  
	      double units=s.nextDouble(); 
	      plan p = gp.getplans(planName);  
	       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.Bill(units);  
	           
	           s.close();	           
}  
	      
}

