package iteracion6.dominio;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import iteracion2.persistencia.Agente;
import iteracion2.dominio.*;


public class ClienteDaoModificar {

	private static ObjectInputStream lectorArchivo;

	public static void BuscarCliente(String []clientenuevo,String clienteviejo) throws ClassNotFoundException{
		String nombre=clientenuevo[0];
		File fichero=new File ("C:\\Users\\Kike\\workspace\\Almacenator\\Clientes\\"+clienteviejo+".txt");
		Cliente nuevo=null;
		Cliente viejo=null;
			if(lectorArchivo==null)
				try {
					lectorArchivo = new ObjectInputStream(new FileInputStream(fichero));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("fichero mal");
				}
				try {
					viejo=(Cliente)lectorArchivo.readObject();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("fichero");
				}
				nuevo.setPedidos(viejo.getPedidos());
				nuevo.setNombre(nombre);
				nuevo.setTelefono(Integer.parseInt(clientenuevo[1]));
				nuevo.setDireccion(clientenuevo[2]);
				nuevo.setCodigo_postal(Integer.parseInt(clientenuevo[3]));
				try {
					Agente.AnadirCliente(nuevo,nombre);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					Agente.BorrarCliente(clienteviejo);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}    
	

}
