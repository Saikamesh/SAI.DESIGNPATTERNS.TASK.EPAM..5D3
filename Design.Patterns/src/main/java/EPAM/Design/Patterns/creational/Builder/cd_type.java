package EPAM.Design.Patterns.creational.Builder;
import java.util.*;
public class cd_type {
private List<packing> items=new ArrayList<packing>();
public void addItem(packing packs) {
	items.add(packs);
}
public void getcost() {
	for(packing packs:items)
		packs.cost();
}
public void showitems()
{
	for(packing packing:items) {
		System.out.print("CD NAME:"+packing.pack());
		System.out.println("|| Price :"+packing.cost());
	}
}
}
