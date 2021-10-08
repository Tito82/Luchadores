import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ring {
	
		
	public static void main(String[] args) {
	System.out.println("FIGHTTTTT");
		
	Luchador luchador1 =new Luchador("Goku", 150, 15);
	Luchador luchador2 =new Luchador("Vegetta", 120, 10);
	Luchador luchador3 =new Luchador("Picollo", 100, 5);	
	new Thread(luchador1).start();
	new Thread(luchador2).start();
	new Thread(luchador3).start();
		

	}
}


