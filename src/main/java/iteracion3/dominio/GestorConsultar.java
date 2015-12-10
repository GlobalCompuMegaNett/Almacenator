package iteracion3.dominio;

import java.io.IOException;


public class GestorConsultar {

	public static String BuscarCliente(String nombre) throws IOException {
		String c;
		c=ClienteDaoConsultar.BuscarCliente(nombre);
	return 	c;
	}
	
	
}
