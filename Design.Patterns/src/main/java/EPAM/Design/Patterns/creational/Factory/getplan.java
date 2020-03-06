package EPAM.Design.Patterns.creational.Factory;

public class getplan {
public plan getplans(String plantype)
{
	if(plantype==null)
		return null;
	else if(plantype.equalsIgnoreCase("localplan")) 
	return new localplan();
	else if(plantype.equalsIgnoreCase("bussinessplan"))
	return new bussinessplan();
	else if(plantype.equalsIgnoreCase("enterpriseplan"))
	return new enterpriseplan();

	return null;
}
}
