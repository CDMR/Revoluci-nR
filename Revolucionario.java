package RevolucionR;

import EHCPI.Civil;

public abstract class Revolucionario extends Civil {
	String corriente;
	public Revolucionario(String nombre, String Ubicacion,String Corriente) {
		super(nombre, region);
		this.corriente=Corriente;
	}

}
