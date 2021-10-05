import java.security.SecureRandom;

public class Luchador implements Runnable {
	
	private static final SecureRandom generador = new SecureRandom();
	private final int sleepTime;
	private String nombre;
	private int vida;
	private int fuerza;
	
	public Luchador(String nombre, int vida, int fuerza) {
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
		sleepTime = generador.nextInt(5000);
		
	}


	@Override
	public void run() {
		try {
			System.out.printf("%s gano %d milisegundos%n%n", this.nombre,this.vida, this.fuerza, sleepTime);
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
		
	}


}
