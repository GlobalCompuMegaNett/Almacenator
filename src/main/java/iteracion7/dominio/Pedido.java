package iteracion7.dominio;


public class Pedido {
	private String id;
	private int productos[];
	private double precio;
	
	public Pedido(String id, int[] productos, double precio) {
		this.id = id;
		this.productos = productos;
		this.precio = precio;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int[] getProductos() {
		return productos;
	}
	public void setProductos(int[] productos) {
		this.productos = productos;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
