package iteracion5.dominio;


public class GestorFacturas {
	
	public static void ModificarPedido(String nombre,String ref) throws ClassNotFoundException{
		FacturaDao.ModificarPedidos(nombre,ref);
	}
	
}
