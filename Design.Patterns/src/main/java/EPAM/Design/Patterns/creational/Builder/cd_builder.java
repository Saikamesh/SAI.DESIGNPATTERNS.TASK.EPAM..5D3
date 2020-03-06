package EPAM.Design.Patterns.creational.Builder;

public class cd_builder {
public cd_type builddisneycd() {
	cd_type cds=new cd_type();
	cds.addItem(new Disney());
	return cds;
}
public cd_type buildwarnerbroscd() {
	cd_type cds=new cd_type();
	cds.addItem(new WarnerBros());
	return cds;
}
}
