package iteracion7.dominio;

import java.io.IOException;

import iteracion7.persistencia.Agente;

public class ContactoDaoBorrar {
	
	public static void BorrarCliente(String nombre) {
		try {
			Agente.BorrarCliente(nombre);
		} catch (IOException e) {
			System.out.println("no se ha podido guardar el contacto ");
			e.printStackTrace();
		}
	}
}
