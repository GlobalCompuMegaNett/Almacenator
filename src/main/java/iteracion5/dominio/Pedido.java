package iteracion5.dominio;

import java.util.Arrays;

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
	@Override
	public String toString() {
		return "productos=\n" +"Coca-cola:" +productos[0]+ "\nPepsi:"+productos[1]+"\n Fanta de Naranja:"+productos[2]+"\nFanta de Limon" 
	+productos[3]+"\nSprite:"+productos[4]+"\n";
	}
	
}
