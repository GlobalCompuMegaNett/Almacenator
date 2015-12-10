package iteracion4.dominio;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;

import iteracion4.persistencia.Agente;




public class PedidoDao {

	
	public static void ModificarPedidos(String nombre,int [] pedido) throws ClassNotFoundException{
		Object o=null;
		ArrayList<Pedido> p =new ArrayList<Pedido> ();
		Pedido ped=new Pedido(generarId(),pedido,CalcularPrecio(pedido));
		o=Agente.BuscarCliente(nombre);
		Cliente c=(Cliente)o;
		c.setPedidos(p);
		p=c.getPedidos();		
		p.add(ped);
		c.setPedidos(p);
		try {
			Agente.BorrarCliente(nombre);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Agente.guardarCliente(c, nombre);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String generarId(){
        Calendar fecha = new GregorianCalendar();
		String id;
		id=String.valueOf(fecha.get(Calendar.YEAR)) +String.valueOf( fecha.get(Calendar.MONTH)) + String.valueOf(fecha.get(Calendar.DAY_OF_MONTH))
		+ String.valueOf(fecha.get(Calendar.HOUR_OF_DAY))+ String.valueOf(fecha.get(Calendar.MINUTE));
		
        return id;
	}
	
	public static double CalcularPrecio(int [] pedido){
		int total=0;
		for(int i=0;i<pedido.length;i++){
			if(i==0){
				total=total +pedido[i]*45;
			}
			if(i==1){
				total=total+pedido[i]*40;
			}
			if(i==2 || i==3){
				total=total+ pedido[i]*38;
			}
			if(i==4){ 
				total=total +pedido[i]*35;
			}
			if(i==5){
				total=total + pedido[i]*52;
			}
			if(i>5){
				
			}
		}
		return total;
	}

}
