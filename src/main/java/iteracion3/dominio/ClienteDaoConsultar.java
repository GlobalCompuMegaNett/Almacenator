package iteracion3.dominio;
import java.io.IOException;

import iteracion3.persistencia.Agente;



public class ClienteDaoConsultar {

	
	public static String BuscarCliente(String nombre) throws IOException {
		Cliente c=null;
		Object o=null;
		o=Agente.BuscarCliente(nombre);
		c=(Cliente)o;
		String texto=c.toString();
		System.out.println(texto);
		return texto;
	}
}
