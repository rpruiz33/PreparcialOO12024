package modelo;

import java.util.Objects;

public class ProdPedido {

	private double precio;
	private String producto;
	
	
	public ProdPedido(double precio, String producto) {
		super();
		this.precio = precio;
		this.producto = producto;
	}




	public boolean equals(ProdPedido producto) {
	return producto.precio==precio && producto.producto.equals(producto);
	}
	


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	@Override
	public String toString() {
		return "ProdPedido:" + precio + ", producto:" + producto + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
