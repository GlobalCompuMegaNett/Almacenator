package iteracion7.dominio;
import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = -4145592449633654082L;
	private String nombre;
	private int telefono;       
    private int codigo_postal;
    private String direccion;
    private ArrayList <Pedido> pedidos;
          
        
	public Cliente(String nombre, int telefono, String direccion, int codigo_postal, ArrayList<Pedido> pedidos) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.codigo_postal = codigo_postal;
		this.pedidos = pedidos;
	}


	public int getCodigo_postal() {
		return codigo_postal;
	}


	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}


	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTelefono() {
		return this.telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	        

        
}
