package iteracion6.persistencia;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Agente{
	
	public static void BorrarCliente(String nombre) throws IOException  {
		File fichero=new File("C:\\Users\\Kike\\workspace\\Almacenator\\Clientes\\"+nombre);
		if(fichero.exists())
			if (fichero.delete())
				System.out.println("El fichero ha sido borrado satisfactoriamente");
			else
				System.out.println("El fichero no puede ser borrado");
	}
	    
	
	public static void AnadirCliente(Object o,String nombre) throws IOException  {
		File fichero=new File("C:\\Users\\Kike\\workspace\\Almacenator\\Clientes\\"+nombre+".txt");	
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
