package iteracion3.persistencia;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Agente{
	private static ObjectInputStream lectorArchivo;
	public static Object BuscarCliente(String nombre) throws ClassNotFoundException{
		File fichero=new File ("C:\\Users\\Kike\\workspace\\Almacenator\\Clientes\\"+nombre);
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
					c =   lectorArchivo.readObject();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	return c;		
	}    
	 
}
