package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {

	List <Mesa> lstMesas;
	List<Cliente> lstClientes;
	List<Reserva> lstReservas;
	
public  SistemaRestaurante() {
	super();
	lstMesas = new ArrayList<Mesa>();
	lstClientes =  new ArrayList<Cliente>();
	lstReservas =  new ArrayList<Reserva>();
}

public List<Mesa> getLstMesas() {
		return lstMesas;
	}



	public void setLstMesas(List<Mesa> lstMesas) {
		this.lstMesas = lstMesas;
	}



	public List<Cliente> getLstClientes() {
		return lstClientes;
	}



	public void setLstClientes(List<Cliente> lstClientes) {
		this.lstClientes = lstClientes;
	}



	public List<Reserva> getLstReservas() {
		return lstReservas;
	}



	public void setLstReservas(List<Reserva> lstReservas) {
		this.lstReservas = lstReservas;
	}



public Cliente traerCliente(long dni) {
	Cliente aux=null;
	int i=0;
	while(i<lstClientes.size() && aux==null) {
		if(lstClientes.get(i).getDni()==dni) {
			aux=lstClientes.get(i);
	
		}
		i++;
	}
	return aux;
		
}

public boolean agregarCliente(String nombre,String apellido, long dni,String telefono )throws Exception {
	boolean aux=false;
	Cliente cliente=null;
	if(traerCliente(dni)!=null) {
	throw new Exception("mismo dni");
	}else {
		int id=1;
		if(lstClientes.size()>1) {
			id=lstClientes.get(lstClientes.size()-1).getIdCliente()+1;
		}
		cliente=new Cliente( id, nombre, apellido, dni,  telefono);
	//System.out.println(cliente.toString());
		lstClientes.add(cliente);
		aux=true;
	}
	return aux;
}




	@Override
	public String toString() {
		return "SistemaRestaurante \n[ListMesas=" + lstMesas + ", ListClientes=" + lstClientes + ", ListReservas="
				+ lstReservas + "]";
	}
	
	
	
	
	
	
	
	public Mesa traerMesa(int nroMesa) {
		Mesa aux=null;
		int i=0;
		while(i<lstMesas.size() && aux==null) {
			if(lstMesas.get(i).getNumeroMesa()==nroMesa) {
				aux=lstMesas.get(i);
			}
			i++;
		}
		return aux;
			
	}
	
	
	public boolean agregarMesa(int nroMesa,int capacidad)throws Exception {
		boolean aux=false;
		
		if(traerMesa(nroMesa)!=null) {
		throw new Exception("mismo mesa numero");
		}else {
			int id=1;
			if(lstMesas.size()>1) {
				id=lstMesas.get(lstMesas.size()-1).getIdMesa()+1;
			}
			lstMesas.add(new Mesa( id, nroMesa, capacidad));
			aux=true;
		}
		return aux;
	}
	
	public Reserva traerReserva(int numeroMesa, LocalDate fechaReserva) {
		Reserva reservaAux=null;
		int i=0;
		while(i<lstReservas.size()&& reservaAux==null) {
			if(lstReservas.get(i).getMesa().getNumeroMesa()==numeroMesa && lstReservas.get(i).getFecha().equals(fechaReserva)) {
				reservaAux=lstReservas.get(i);
			}
			i++;
			}
		return reservaAux;
		}
		
		

	
	
	
	public boolean agregarReserva(Cliente cliente,LocalDate fechaReserva,Mesa mesa, int cantComenzales)throws Exception {
	
	Reserva auxReserva=traerReserva(mesa.getNumeroMesa(), fechaReserva);
	if(auxReserva!=null ) {
		throw new Exception("ya esta hecha la reserva para esa mesa");
	}
	int id=	1;
	if(lstReservas.size()>1) {
		id=lstReservas.get(lstReservas.size()-1).getIdReserva()+1;
	
	}
	
	return lstReservas.add(new Reserva( id, cliente,  fechaReserva, mesa,  cantComenzales));
	}
	
	
	public List<Reserva> traerReservasPorFecha(LocalDate desde,LocalDate hasta){
		 ArrayList<Reserva> list = new ArrayList<Reserva>();
	for(int i=0;i<lstReservas.size();i++) {
			LocalDate auxDate=Funciones.traerFechasEntre(desde,hasta,lstReservas.get(i).getFecha());
			if(auxDate!=null) {
			list.add(lstReservas.get(i));
			}
		}
		
		return list;
		
	}
public List<Mesa>traerMesasLibresPorFecha(LocalDate fecha){
	
	 ArrayList<Mesa> list = new ArrayList<Mesa>();
	 list.addAll(getLstMesas());
		for(int i=0;i<lstReservas.size();i++) {
			boolean auxMesa=lstReservas.get(i).getFecha().isEqual(fecha);
			if(auxMesa==true) {
			list.remove(lstReservas.get(i).getMesa());
			}
		}
	 
	 
	 
	 
	 return list;

}
	
	}
