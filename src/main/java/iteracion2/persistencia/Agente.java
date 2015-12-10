package iteracion2.persistencia;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Agente{

	public static void AnadirCliente(Object o,String nombre) throws IOException  {
		File fichero=new File("src/Clientes/"+nombre+".txt");	
		 try
	        {
			 ObjectOutputStream oos = new ObjectOutputStream(
                     new FileOutputStream(fichero));
                 oos.writeObject(o);
             oos.close();
	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}	
	
	 
}
