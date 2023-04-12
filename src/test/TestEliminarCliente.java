package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestEliminarCliente {

	public static void main(String[] args) {
		//intentar eliminar un cliente con prestamos
		ClienteABM clienteABM = new ClienteABM();
		try {
			clienteABM.eliminar(1);
			System.out.println("Cliente eliminado");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
