package test;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Hibernate;

import datos.Cliente;
import datos.Prestamo;
import negocio.ClienteABM;
import negocio.PrestamoABM;

public class TestTraerPrestamo {
	public static void main(String[] args) {
		
		PrestamoABM prestamoABM=new PrestamoABM();
		ClienteABM clienteABM = new ClienteABM();
		//long idPrestamo=1;
		System.out.println("\n---> TraerPrestamo idPrestamo="+ 1 + "\n\n");
		try {
			Prestamo p=prestamoABM.traer(1);
			System.out.println(p + "\nPertenece a "+p.getCliente());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//agregar prestamos
		//llamar por ID me da null, llamar por dni retorna el cliente
		long id = 3;
		System.out.println("-----------------------------------------------");
		Cliente cliente2 = clienteABM.traer(id);
		//System.out.println("cliente id: 2 " + cliente1);
		prestamoABM.agregar(LocalDate.now(), 500.0, 800.0, 770, cliente2);
		
		//modificar prestamo
		try {
			Prestamo p = prestamoABM.traer(id);
			p.setCantCuotas(20);
			prestamoABM.modificar(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//eliminar prestamo
		try {
			prestamoABM.eliminar(prestamoABM.traer(id));	
			System.out.println("Prestamo eliminado");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
			
			
		
		//implementar Si este cliente no tiene prestamos otorgados imprima el mensaje
		//ClienteABM clienteABM=new ClienteABM();
		//int dni=14000000; 
		//Cliente c= clienteABM.traer(dni);
		//System.out.println("\n---> TraerPrestamos del Cliente="+c+ "\n\n");
		//List<Prestamo> prestamos=prestamoABM.traerPrestamo(c);
		//implementar Si este cliente no tiene prestamos otorgados imprima elmensaje
		//for (Prestamo o: prestamos) System.out.println(o + "\nPertenece a "+o.getCliente());
	}
}
