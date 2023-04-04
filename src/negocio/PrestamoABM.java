package negocio;
import dao.PrestamoDao;
import java.time.LocalDate;
import java.util.List;
import datos.Cliente;
import datos.Prestamo;

public class PrestamoABM {
	private PrestamoDao dao=new PrestamoDao();

	public Prestamo traerPrestamo(long idPrestamo){
		//Implementar: si el no existe el prestamo lanzar la excepción
		Prestamo p =dao.traer(idPrestamo);
		return p;
	}

	public List<Prestamo> traerPrestamo(Cliente c) {return dao.traer(c);}
	
	/* Pendiente implementar
	 * Alta, Modificar
	 */
}
