package iteracion7.persistencia;


import java.io.File;
import java.io.IOException;

public class Agente{

	public static void BorrarCliente(String nombre) throws IOException  {
		File fichero=new File("C:\\Users\\Kike\\workspace\\Almacenator\\Clientes\\"+nombre);
		if(fichero.exists())
			if (fichero.delete())
				System.out.println("El fichero ha sido borrado satisfactoriamente");
			else
				System.out.println("El fichero no puede ser borrado");
	}
	    
	
	
}
