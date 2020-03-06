package EPAM.Design.Patterns.behavioral.template;

public class FIFA20 extends game {
	@Override
	void loadgame() {
		System.out.println("FIFA20 Loading... \n ::Start PLaying::  ");		
	}
	@Override
	void begingame() {
	System.out.println("Match Started. Score More Goals to Win the Match ");	
	}
	@Override
	void exitgame() {
		System.out.println("Match Finished \n ::Exiting Game:: ");
	}

}
