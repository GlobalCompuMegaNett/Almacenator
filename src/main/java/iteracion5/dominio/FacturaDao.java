package iteracion5.dominio;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;

import iteracion2.dominio.*;
import iteracion2.persistencia.Agente;


public class FacturaDao {

	
	public static String ModificarPedidos(String nombre,String ref) throws ClassNotFoundException{
		Object o=null;
		int indice = 0;
		String factura = "";
		ArrayList<Pedido> p =new ArrayList<Pedido> ();
		Pedido ped=null;
		o=Agente.BuscarCliente(nombre);
		Cliente c=(Cliente)o;
		for(int i=0;i<c.getPedidos().size();i++){
			if(c.getPedidos().get(i).getId()==ref){
				ped=c.getPedidos().get(i);
				factura=Factura(ped,ref);
				indice=i;
			
			}
			
		}		
		p=c.getPedidos();		
		p.remove(indice);
		c.setPedidos(p);
		try {
			Agente.BorrarCliente(nombre);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Agente.AnadirCliente(c, nombre);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factura;

	}

	public static String Factura(Pedido p,String ref){
		String factura = p.getId() + p.getPrecio() + "/n" ;
		for(int i=0;i<p.getProductos().length;i++){
		factura =factura +1;
			
			
		}
		return factura;
	}

}
