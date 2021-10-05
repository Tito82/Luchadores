import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ring {

	public static void main(String[] args) {
		Luchador luchador1 =new Luchador("Goku", 150, 200);
		Luchador luchador2 =new Luchador("Vegetta", 120, 150);
		Luchador luchador3 =new Luchador("Picollo", 100, 100);
	
		System.out.printf("Iniciando la pelea  %n%n");
		ExecutorService executorService= Executors.newCachedThreadPool();
		
		executorService.execute(luchador1);
		executorService.execute(luchador2);
		executorService.execute(luchador3);
		executorService.shutdown();
		
		System.out.printf("Pelea iniada, metodo main finalizado %n%n");
		

	}
}


