package iteracion2.persistencia;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
		
	private static ObjectInputStream lectorArchivo;
	public static Object BuscarCliente(String nombre){
		File fichero=new File ("src/Clientes/"+nombre);
		System.out.println(nombre);
		Object c=null;
			if(lectorArchivo==null)
				try {
					lectorArchivo = new ObjectInputStream(new FileInputStream(fichero));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					c = lectorArchivo.readObject();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return c;		
	}    

    
		
	public static void BorrarCliente(String nombre) throws IOException  {
		File fichero=new File("src/Cliente/"+nombre);
		if(fichero.exists())
			if (fichero.delete())
				System.out.println("El fichero ha sido borrado satisfactoriamente");
			else
				System.out.println("El fichero no puede ser borrado");
	}

	 
}
