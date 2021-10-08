import java.security.SecureRandom;

public class Luchador extends Thread {

	private String nombre;
	private int vida;
	private int fuerza;
	
	public Luchador(String nombre, int vida, int fuerza) {
		this.nombre = nombre;
		this.vida = vida;
		this.fuerza = fuerza;
	}

	@Override
	public void run() {
		
		while( this.vida - fuerza > 0) {
			this.vida -= fuerza;
			System.out.println("la vida de " + getNombre() + " es " + getVida());
			luchar();
			Thread.yield();
		}
	}
	
	public void luchar(){
		if(this.vida - fuerza >0 ) {
			this.vida -= fuerza;
			
			
		}else {
			System.out.println(getNombre() +" estas muerto");
		}
		
	}		
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public int getFuerza() {
		return fuerza;
	}


	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
		
	
}


