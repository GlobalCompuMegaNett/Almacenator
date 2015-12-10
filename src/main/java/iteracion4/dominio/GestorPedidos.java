package iteracion4.dominio;


public class GestorPedidos {
	
	public static void ModificarPedido(String nombre,int [] pedido) throws ClassNotFoundException{
		PedidoDao.ModificarPedidos(nombre,pedido);
	}
	
}
