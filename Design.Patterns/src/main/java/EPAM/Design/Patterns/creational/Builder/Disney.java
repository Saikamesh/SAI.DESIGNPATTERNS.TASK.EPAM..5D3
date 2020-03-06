package EPAM.Design.Patterns.creational.Builder;

public class Disney extends company{
	@Override
	public int cost() {
		return 350;
	}
	@Override
	public String pack() {
		return "A Disney Production";
	}
}
