package test;

import modelo.SistemaRestaurante;

public class TestCu {

	public static void main(String[] args) {
		SistemaRestaurante r = new SistemaRestaurante();
		System.out.println(r.traerCliente(333333));
		try {
			System.out.println(r.agregarCliente("rober", "ruixx", 121212, "2323232"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
