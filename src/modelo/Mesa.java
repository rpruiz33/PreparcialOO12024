package modelo;

import java.util.Objects;

public class Mesa {
    //atributos
	private int idMesa;
	private int NumeroMesa;
	private int capacidad;
	
	//constructor 
	public Mesa(int idMesa, int numeroMesa, int capacidad) {
		super();
		this.idMesa = idMesa;
		NumeroMesa = numeroMesa;
		this.capacidad = capacidad;
	}
//getters y setters
	public int getIdMesa() {
		return idMesa;
	}

	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}

	public int getNumeroMesa() {
		return NumeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		NumeroMesa = numeroMesa;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	@Override
	public String toString() {
		return "/Mesa id:"+ idMesa+"/nnro mesa:"+NumeroMesa+ "/ncapacidad:" + capacidad ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
