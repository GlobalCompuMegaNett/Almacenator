package iteracion2.dominio;

import java.io.IOException;


public class GestorAnadirCliente {

	public static void guardarContacto(String nombre, int telefono, String direccion, int codigo_postal) throws IOException {
		Cliente c=new Cliente(nombre,telefono,direccion,codigo_postal,null);
		AnadirCliente.AnadirCliente(c);
	}

}
