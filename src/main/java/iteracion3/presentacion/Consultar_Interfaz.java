package iteracion3.presentacion;
import java.awt.EventQueue;
import iteracion3.dominio.GestorConsultar;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Consultar_Interfaz {
	 
	private JFrame frame;
	private JPanel pnlConsultar;
	private JLabel lblISeleccioneElNombre;
	private JLabel lblInformacion;
	private JScrollPane scrollPane;
	private JTextArea taInformacion;
	private JButton btnConsultar;
	private JComboBox<Object> comboBox;
	private String nombre="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultar_Interfaz window = new Consultar_Interfaz();
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
	public Consultar_Interfaz() {
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
			frame.getContentPane().add(pnlConsultar, BorderLayout.EAST);
			GridBagLayout gbl_pnlConsultar = new GridBagLayout();
			gbl_pnlConsultar.columnWidths = new int[]{25, 100, 26, 0, 0, 29, 82, 0, 0, 0};
			gbl_pnlConsultar.rowHeights = new int[]{0, 30, 141, 42, 0};
			gbl_pnlConsultar.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnlConsultar.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			pnlConsultar.setLayout(gbl_pnlConsultar);
			{
				lblISeleccioneElNombre = new JLabel("Seleccione el nombre:");
				GridBagConstraints gbc_lblISeleccioneElNombre = new GridBagConstraints();
				gbc_lblISeleccioneElNombre.anchor = GridBagConstraints.EAST;
				gbc_lblISeleccioneElNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblISeleccioneElNombre.gridx = 1;
				gbc_lblISeleccioneElNombre.gridy = 1;
				pnlConsultar.add(lblISeleccioneElNombre, gbc_lblISeleccioneElNombre);
			}
			{
				comboBox = new JComboBox<Object>();
				comboBox.setRequestFocusEnabled(false);
				comboBox.setModel(new DefaultComboBoxModel<Object>(ListadeClientes()));
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.gridwidth = 4;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 2;
				gbc_comboBox.gridy = 1;
				pnlConsultar.add(comboBox, gbc_comboBox);
			}
			{
				lblInformacion = new JLabel("Informaci\u00F3n");
				GridBagConstraints gbc_lblInformacion = new GridBagConstraints();
				gbc_lblInformacion.insets = new Insets(0, 0, 5, 5);
				gbc_lblInformacion.gridx = 1;
				gbc_lblInformacion.gridy = 2;
				pnlConsultar.add(lblInformacion, gbc_lblInformacion);
			}
			{
				scrollPane = new JScrollPane();
				GridBagConstraints gbc_scrollPane = new GridBagConstraints();
				gbc_scrollPane.gridwidth = 5;
				gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPane.fill = GridBagConstraints.BOTH;
				gbc_scrollPane.gridx = 2;
				gbc_scrollPane.gridy = 2;
				pnlConsultar.add(scrollPane, gbc_scrollPane);
				{
					taInformacion = new JTextArea();
					scrollPane.setViewportView(taInformacion);
				}
			}
			{
				btnConsultar = new JButton("Consultar");
				btnConsultar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							nombre=(String)comboBox.getSelectedItem();
						//	System.out.println(GestorConsultar.BuscarCliente(nombre));
							taInformacion.setText(GestorConsultar.BuscarCliente(nombre));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							System.out.println("no tira");						
						}
						
						
				
					}
				});
				GridBagConstraints gbc_btnConsultar = new GridBagConstraints();
				gbc_btnConsultar.insets = new Insets(0, 0, 0, 5);
				gbc_btnConsultar.gridx = 7;
				gbc_btnConsultar.gridy = 3;
				pnlConsultar.add(btnConsultar, gbc_btnConsultar);
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

