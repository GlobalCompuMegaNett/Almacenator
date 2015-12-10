package iteracion6.presentacion;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import iteracion6.dominio.GestorModificar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Modificar_Interfaz {
	 
	private JFrame frame;
	private JPanel pnlConsultar;
	private JLabel lblIntroduzcaElNombre;
	private JLabel lblNombre;
	private JLabel lblTelfono;
	private JLabel lblCodigoPostal;
	private JLabel lblDireccion;
	private JButton btnModificar;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtCodigoPostal;
	private JComboBox<Object> cbClienteviejo;
	private String nombre;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificar_Interfaz window = new Modificar_Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Modificar_Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			pnlConsultar = new JPanel();
			frame.getContentPane().add(pnlConsultar, BorderLayout.NORTH);
			GridBagLayout gbl_pnlConsultar = new GridBagLayout();
			gbl_pnlConsultar.columnWidths = new int[]{26, 0, 51, 97, 111, 102, 0, 0};
			gbl_pnlConsultar.rowHeights = new int[]{0, 26, 0, 0, 0, 0, 0, 42, 0, 46, 0};
			gbl_pnlConsultar.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_pnlConsultar.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnlConsultar.setLayout(gbl_pnlConsultar);
			{
				lblIntroduzcaElNombre = new JLabel("Introduzca el nombre del que queremos modificar:");
				GridBagConstraints gbc_lblIntroduzcaElNombre = new GridBagConstraints();
				gbc_lblIntroduzcaElNombre.gridwidth = 3;
				gbc_lblIntroduzcaElNombre.anchor = GridBagConstraints.EAST;
				gbc_lblIntroduzcaElNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblIntroduzcaElNombre.gridx = 2;
				gbc_lblIntroduzcaElNombre.gridy = 1;
				pnlConsultar.add(lblIntroduzcaElNombre, gbc_lblIntroduzcaElNombre);
			}
			{
				cbClienteviejo = new JComboBox<Object>();
				GridBagConstraints gbc_cbClienteviejo = new GridBagConstraints();
				cbClienteviejo.setModel(new DefaultComboBoxModel<Object>(ListadeClientes()));
				gbc_cbClienteviejo.insets = new Insets(0, 0, 5, 5);
				gbc_cbClienteviejo.fill = GridBagConstraints.HORIZONTAL;
				gbc_cbClienteviejo.gridx = 5;
				gbc_cbClienteviejo.gridy = 1;
				pnlConsultar.add(cbClienteviejo, gbc_cbClienteviejo);
			}
			{
				lblNombre = new JLabel("Nombre");
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.EAST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 3;
				gbc_lblNombre.gridy = 2;
				pnlConsultar.add(lblNombre, gbc_lblNombre);
			}
			{
				txtNombre = new JTextField();
				GridBagConstraints gbc_txtNombre = new GridBagConstraints();
				gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
				gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtNombre.gridx = 4;
				gbc_txtNombre.gridy = 2;
				pnlConsultar.add(txtNombre, gbc_txtNombre);
				txtNombre.setColumns(10);
			}
			{
				lblTelfono = new JLabel("Tel\u00E9fono");
				GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
				gbc_lblTelfono.anchor = GridBagConstraints.EAST;
				gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelfono.gridx = 3;
				gbc_lblTelfono.gridy = 3;
				pnlConsultar.add(lblTelfono, gbc_lblTelfono);
			}
			{
				txtTelefono = new JTextField();
				GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
				gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
				gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtTelefono.gridx = 4;
				gbc_txtTelefono.gridy = 3;
				pnlConsultar.add(txtTelefono, gbc_txtTelefono);
				txtTelefono.setColumns(10);
			}
			{
				lblDireccion = new JLabel("Direcci\u00F3n");
				GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
				gbc_lblDireccion.anchor = GridBagConstraints.EAST;
				gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
				gbc_lblDireccion.gridx = 3;
				gbc_lblDireccion.gridy = 4;
				pnlConsultar.add(lblDireccion, gbc_lblDireccion);
			}
			{
				txtDireccion = new JTextField();
				GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
				gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
				gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtDireccion.gridx = 4;
				gbc_txtDireccion.gridy = 4;
				pnlConsultar.add(txtDireccion, gbc_txtDireccion);
				txtDireccion.setColumns(10);
			}
			{
				lblCodigoPostal = new JLabel("Codigo postal");
				GridBagConstraints gbc_lblCodigoPostal = new GridBagConstraints();
				gbc_lblCodigoPostal.anchor = GridBagConstraints.EAST;
				gbc_lblCodigoPostal.insets = new Insets(0, 0, 5, 5);
				gbc_lblCodigoPostal.gridx = 3;
				gbc_lblCodigoPostal.gridy = 5;
				pnlConsultar.add(lblCodigoPostal, gbc_lblCodigoPostal);
			}
			{
				txtCodigoPostal = new JTextField();
				GridBagConstraints gbc_txtCodigoPostal = new GridBagConstraints();
				gbc_txtCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCodigoPostal.insets = new Insets(0, 0, 5, 5);
				gbc_txtCodigoPostal.gridx = 4;
				gbc_txtCodigoPostal.gridy = 5;
				pnlConsultar.add(txtCodigoPostal, gbc_txtCodigoPostal);
				txtCodigoPostal.setColumns(10);
			}
			{
				btnModificar = new JButton("Modificar");
				btnModificar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nombre=(String)cbClienteviejo.getSelectedItem();
						String [] nuevo=new String[5];
								nuevo[0]=txtNombre.getText();
								nuevo[1]=txtTelefono.getText();
								nuevo[2]=txtDireccion.getText();
								nuevo[3]=txtCodigoPostal.getText();
						try {
							GestorModificar.ModificarCliente(nuevo, nombre);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
					}
				});
				GridBagConstraints gbc_btnModificar = new GridBagConstraints();
				gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
				gbc_btnModificar.gridx = 5;
				gbc_btnModificar.gridy = 8;
				pnlConsultar.add(btnModificar, gbc_btnModificar);
			}
		}
	}
	
	
	
	
	public String[] ListadeClientes(){
		File folder = new File("Clientes/");
		File[] listOfFiles = folder.listFiles();
	    String cli []=new String[listOfFiles.length];
		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
			    cli [i]=(String) listOfFiles[i].getName();
		      }
		    }
		    return cli;
	}
}
