package test;

import java.time.LocalDate;

import javax.sql.rowset.serial.SQLOutputImpl;

import modelo.Cliente;
import modelo.Mesa;
import modelo.SistemaRestaurante;

public class TestCu {

	public static void main(String[] args) {
		SistemaRestaurante restauraante = new SistemaRestaurante();
		System.out.println(restauraante.traerCliente(333333));
		try {
			System.out.println(restauraante.agregarCliente("Rodrigo", "Sanhez", 32594053, "541179456274"));
			System.out.println(restauraante.agregarCliente("Adriana", "Diaz", 31953256, "541109462742"));
			System.out.println(restauraante.agregarCliente("Marcos", "Garcia", 34096528, "541188345186"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(restauraante.getLstClientes().toString());
		
		try {
			System.out.println(restauraante.agregarMesa(1, 2));
			System.out.println(restauraante.agregarMesa(2, 2));
			System.out.println(restauraante.agregarMesa(3, 4));
			System.out.println(restauraante.agregarMesa(4, 6));
			System.out.println(restauraante.agregarMesa(5, 4));
			System.out.println(restauraante.agregarMesa(6, 2));
		
		}catch(Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(restauraante.getLstMesas().toString());
		
		
		try {
			
			System.out.println(restauraante.agregarReserva(restauraante.traerCliente(32594053) ,LocalDate.of(2023,8,15), restauraante.traerMesa(1),2));
			System.out.println(restauraante.agregarReserva(restauraante.traerCliente(31953256) ,LocalDate.of(2023,8,15), restauraante.traerMesa(4),4));
			System.out.println(restauraante.agregarReserva(restauraante.traerCliente(34096528) ,LocalDate.of(2023,8,25), restauraante.traerMesa(5),4));
			
		}catch (Exception e) {
			
			// TODO Auto-generated catch block
						e.printStackTrace();	
		}
		System.out.println(restauraante.getLstReservas().toString());
		System.out.println(restauraante.traerReservasPorFecha(LocalDate.of(2023, 8, 15),LocalDate.of(2023, 8, 20)));
		System.out.println(restauraante.traerMesasLibresPorFecha(LocalDate.of(2023,8, 15)));
		
		try {
			System.out.println(restauraante.agregarCliente("Adriana", "Diaz", 31953256, "541109462742"));
		}catch(Exception e) {
			
			// TODO Auto-generated catch block
						e.printStackTrace();	
		}
		try {
			System.out.println(restauraante.agregarMesa(3, 4));
		}catch(Exception e) {
			
			// TODO Auto-generated catch block
						e.printStackTrace();	
		}
		try {
			System.out.println(restauraante.agregarReserva(restauraante.traerCliente(31953256) ,LocalDate.of(2023,8,25), restauraante.traerMesa(4),4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(restauraante.agregarReserva(restauraante.traerCliente(31953256) ,LocalDate.of(2023,8,17), restauraante.traerMesa(4),4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}