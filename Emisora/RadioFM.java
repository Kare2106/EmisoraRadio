package Emisora;

public class RadioFM {
	
	private float frecuencia;

	public float getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(float frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	public float subir() {
		frecuencia += 0.5;
		System.out.println("\n La frecuencia a subir es: " + frecuencia);
		
		return frecuencia;
	}
	
	public float bajar() {
		frecuencia -= 0.5;
		System.out.println("\n La frecuencia a bajar es: " + frecuencia);
		return frecuencia;		
	}
	
	public float display() {
		System.out.println("\n La frecuencia es: " + frecuencia);
		return frecuencia;
	}
	
	public float controlador () {
		
		if (frecuencia < 80) {
			frecuencia = 108;
			System.out.println("s");
			return frecuencia;
		}
		else if (frecuencia > 108) {
			frecuencia = 80;
			return frecuencia;
		}
		else {
	    	return frecuencia;
	    }
	}
}
