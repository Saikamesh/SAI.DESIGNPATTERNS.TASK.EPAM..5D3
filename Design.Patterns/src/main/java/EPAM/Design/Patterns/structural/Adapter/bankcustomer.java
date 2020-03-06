package EPAM.Design.Patterns.structural.Adapter;

import java.util.Scanner;
public class bankcustomer extends details implements creditcard{

public void givedetails() {
	Scanner s=new Scanner(System.in);
	System.out.println("\n Enter Account Holder Name :");
	String customername=s.nextLine();
	System.out.println("\n Enter bank name :");
	String bankname=s.nextLine();
	System.out.println("\n Enter Account Number");
	long accno=s.nextLong();
	setaccholdername(customername);
	setaccnumber(accno);
	setbankname(bankname);
	s.close();
}

public String getcreditcard() {
	long accno=getaccnumber();
	String accholdername=getaccholdername();
	String bname=getbankname();
	return ("The Account Number "+accno+" of "+accholdername+" in "+bname+" bank is valid and Verified for issuing credit card ");
}
}
