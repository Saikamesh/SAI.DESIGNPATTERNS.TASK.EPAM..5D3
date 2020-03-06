package EPAM.Design.Patterns.creational.Builder;

public class WarnerBros extends company {
	@Override
	public int cost() {
		return 200;
	}
	@Override
	public String pack() {
		return "WB-WarnerBros Production";
	}
}
