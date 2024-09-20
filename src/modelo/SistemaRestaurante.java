package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
	
	if(traerCliente(dni)!=null) {
	throw new Exception("mismo dni");
	}else {
		int id=1;
		if(lstClientes.size()>1) {
			id=lstClientes.get(lstClientes.size()-1).getIdCliente()+1;
		}
		lstClientes.add(new Cliente( id, nombre, apellido, dni,  telefono));
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
	
	
	
	
	
	
	
	
}
