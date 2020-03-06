package EPAM.Design.Patterns.creational.Builder;
public class builder_main {
public static void main(String[] args)
{
	cd_builder cdb=new cd_builder();
cd_type type1=cdb.builddisneycd();
type1.showitems();
cd_type type2=cdb.buildwarnerbroscd();
type2.showitems();
}
}
