package iteracion7.dominio;

import java.io.IOException;

public class GestorBorrar {

	public static void BorrarCliente(String nombre) throws IOException {
		ContactoDaoBorrar.BorrarCliente(nombre);
	}

}
