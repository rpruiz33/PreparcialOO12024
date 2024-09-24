package modelo;



public class Cliente {
//atributos	
private int idCliente;
private String nombre;
private String apellido;
private long dni;
private String telefono;


public Cliente(int idCliente, String nombre, String apellido, long dni, String telefono) {
	super();
	this.idCliente = idCliente;
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.telefono = telefono;
}


public int getIdCliente() {
	return idCliente;
}


public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public long getDni() {
	return dni;
}


public void setDni(long dni) {
	this.dni = dni;
}


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}







@Override
public String toString() {
	return "\nCliente [nombre:" + nombre + " ,apellido:" + apellido + " ,dni:" + dni + " ,telefono:" + telefono +"]";
}



public boolean equals(Cliente cliente) {
	return cliente.dni==dni && cliente.apellido.equals(apellido)&&cliente.idCliente==idCliente && cliente.nombre.equals(nombre)&& cliente.telefono.equals(telefono);
}

























	
	
	
	
}
