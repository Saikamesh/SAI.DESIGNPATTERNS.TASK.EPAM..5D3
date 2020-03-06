package EPAM.Design.Patterns.behavioral.template;

public class template_main {
public static void main(String[] args)throws Exception {
	game g=new PUBG();
	g.play();
	System.out.println("\n \n");
	g=new FIFA20();
	g.play();
}
}
