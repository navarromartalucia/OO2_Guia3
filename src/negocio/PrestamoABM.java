package negocio;
import dao.PrestamoDao;
import java.time.LocalDate;
import java.util.List;
import datos.Cliente;
import datos.Prestamo;

public class PrestamoABM {
	private PrestamoDao dao=new PrestamoDao();

	public Prestamo traerPrestamo(long idPrestamo)throws Exception{
		//Implementar: si el no existe el prestamo lanzar la excepción
		if( dao.traerPorID(idPrestamo) == null) throw new Exception("ERROR: El ID del prestamo no se ha encontrado en la base de datos");
		Prestamo p =dao.traerPorID(idPrestamo);
		return p;
	}

	public List<Prestamo> traerPrestamo(Cliente c) {
		return dao.traerPorCliente(c);
	}
	
	/* Pendiente implementar
	 * Alta, Modificar
	 */
	
	public int agregar(LocalDate fecha, double monto, double interes, int cantCuotas, Cliente cliente){
		Prestamo p = new Prestamo(fecha, monto, interes, cantCuotas, cliente);
		return dao.agregar(p);
	}
	
	
}
