package iteracion6.dominio;

import java.io.IOException;



public class GestorModificar {

	public static void ModificarCliente(String [] nuevocliente,String nombreviejo) throws IOException, ClassNotFoundException {
		ClienteDaoModificar.BuscarCliente(nuevocliente,nombreviejo);
	}
	
}
