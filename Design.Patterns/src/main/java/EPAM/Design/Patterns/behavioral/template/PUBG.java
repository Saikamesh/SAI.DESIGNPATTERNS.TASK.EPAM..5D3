package EPAM.Design.Patterns.behavioral.template;

public class PUBG extends game {

	@Override
	void loadgame() {
	System.out.println("PUBG Loading.. \n ::Start Playing:: ");
	}
	@Override
	void begingame() {
		System.out.println("Battle Started. Be The Last player to be Alive to Win");
	}
	@Override
	void exitgame() {
		System.out.println("Battle Finished \n ::Exiting Game:: ");
	}
}
