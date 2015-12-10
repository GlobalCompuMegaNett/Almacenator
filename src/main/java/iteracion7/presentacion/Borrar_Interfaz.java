package iteracion7.presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import iteracion7.dominio.GestorBorrar;


public class Borrar_Interfaz {

	private JFrame frame;
	private JPanel panel;
	private JButton btnBorrar;
	private JLabel lblEscribeElNombre;
	private JComboBox<Object> comboBox;
	private String nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Borrar_Interfaz window = new Borrar_Interfaz();
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
	public Borrar_Interfaz() {
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
			panel = new JPanel();
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{49, 89, 0, 0, 0, 0, 0, 69, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{28, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				
			{
				comboBox = new JComboBox<Object>();
				comboBox.setRequestFocusEnabled(false);
				comboBox.setModel(new DefaultComboBoxModel<Object>(ListadeClientes()));
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.gridwidth = 4;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 1;
				gbc_comboBox.gridy = 2;
				panel.add(comboBox, gbc_comboBox);
				
			}
			{
				lblEscribeElNombre = new JLabel("Escribe el nombre del cliente que quieres borrar");
				GridBagConstraints gbc_lblEscribeElNombre = new GridBagConstraints();
				gbc_lblEscribeElNombre.gridwidth = 4;
				gbc_lblEscribeElNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblEscribeElNombre.gridx = 5;
				gbc_lblEscribeElNombre.gridy = 2;
				panel.add(lblEscribeElNombre, gbc_lblEscribeElNombre);
			}
		
			{
				btnBorrar = new JButton("Borrar");
				btnBorrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							nombre=(String)comboBox.getSelectedItem();
							GestorBorrar.BorrarCliente(nombre);
							System.exit( 0 ); 
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							System.out.println("borrar");						
						}
					}
				});
				GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
				gbc_btnBorrar.insets = new Insets(0, 0, 0, 5);
				gbc_btnBorrar.gridx = 8;
				gbc_btnBorrar.gridy = 6;
				panel.add(btnBorrar, gbc_btnBorrar);
			}
		}
	}
	
	

 }
	
	public String[] ListadeClientes(){
		File folder = new File("src/Clientes/");
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


