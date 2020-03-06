package EPAM.Design.Patterns.behavioral.template;

public abstract class game {
abstract void loadgame();
abstract void begingame();
abstract void exitgame();
public final void play() {
	loadgame();
	begingame();
	exitgame();
}
}
