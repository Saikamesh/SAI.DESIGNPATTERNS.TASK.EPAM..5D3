package EPAM.Design.Patterns.structural.Adapter;

public class details {
private String bankname;
private String accholder;
private long accnumber;
public void setaccholdername(String accholdername){
	accholder=accholdername;
}
public void setbankname(String bankname) {
	this.bankname=bankname;
}
public void setaccnumber(long accnumber) {
	this.accnumber=accnumber;
}
public String getbankname(){
	return bankname;
}
public String getaccholdername() {
	return accholder;
}
public long getaccnumber() {
	return accnumber;
}
}
