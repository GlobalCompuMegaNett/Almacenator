package iteracion2.dominio;

import java.io.IOException;

import iteracion2.persistencia.Agente;


public class AnadirCliente {
	public static void AnadirCliente(Cliente c) {

		try {
			Agente.AnadirCliente(c,c.getNombre());
		} catch (IOException e) {
			System.out.println("no se ha podido guardar el contacto ");
			e.printStackTrace();
		}
	}
}
