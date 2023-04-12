package test;

import java.time.LocalDate;
import negocio.ClienteABM;

public class TestAgregarCliente {
	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		try{
			abm.agregar("Navarro", "Luis", 17444627,LocalDate.of(1965, 11, 18));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try{
			abm.agregar("Navarro", "Lu", 41473969,LocalDate.of(1998, 8, 14));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
