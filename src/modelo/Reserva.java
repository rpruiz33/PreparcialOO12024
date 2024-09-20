package modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {

	private int idReserva;
	private Cliente cliente;
	private LocalDate fecha;
	private Mesa mesa;
	private int cantComensales;
	
	public Reserva(int idReserva, Cliente cliente, LocalDate fecha, Mesa mesa, int cantComensales) {
		super();
		this.idReserva = idReserva;
		this.cliente = cliente;
		this.fecha = fecha;
		this.mesa = mesa;
		this.cantComensales = cantComensales;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public int getCantComensales() {
		return cantComensales;
	}

	public void setCantComensales(int cantComensales) {
		this.cantComensales = cantComensales;
	}

	private boolean validarComensales(int cantComensales)throws Exception{
		boolean aux=false;
	if (cantComensales>mesa.getCapacidad()) {
		throw new Exception ("se paso de la capacidad de comensales");
	}
	else {
		setCantComensales(cantComensales);
		aux=true;
	}
	return aux;
}




	@Override
	public String toString() {
		return "Reserva id:" + idReserva + ", cliente:" + cliente + ",\n fecha:" + fecha + ", mesa:" + mesa
				+ ", cantComensales:" + cantComensales + "]";
	}
	
	
	
	
	
	
	
	
}
