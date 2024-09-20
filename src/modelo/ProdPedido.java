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


	@Override
	public int hashCode() {
		return Objects.hash(precio, producto);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdPedido other = (ProdPedido) obj;
		return Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Objects.equals(producto, other.producto);
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
