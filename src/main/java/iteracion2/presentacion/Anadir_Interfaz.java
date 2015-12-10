package iteracion2.presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import iteracion2.dominio.GestorAnadirCliente;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class Anadir_Interfaz {

	private JFrame frame;
	private JLabel lblIntroduzcaLosDatos;
	private JLabel lblNombre;
	private JLabel lblTelfono;
	private JLabel lblDireccin;
	private JLabel lblCdigoPostal;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JButton btnAadir;
	private JTextField txtTelefono;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anadir_Interfaz window = new Anadir_Interfaz();
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
	public Anadir_Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{44, 75, 99, 162, 79, 0};
		gridBagLayout.rowHeights = new int[]{0, 32, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		{
			lblIntroduzcaLosDatos = new JLabel("Introduzca los datos nuevos del cliente");
			GridBagConstraints gbc_lblIntroduzcaLosDatos = new GridBagConstraints();
			gbc_lblIntroduzcaLosDatos.gridwidth = 3;
			gbc_lblIntroduzcaLosDatos.insets = new Insets(0, 0, 5, 5);
			gbc_lblIntroduzcaLosDatos.gridx = 1;
			gbc_lblIntroduzcaLosDatos.gridy = 1;
			frame.getContentPane().add(lblIntroduzcaLosDatos, gbc_lblIntroduzcaLosDatos);
		}
		{
			lblNombre = new JLabel("Nombre");
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.EAST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 2;
			frame.getContentPane().add(lblNombre, gbc_lblNombre);
		}
		{
			txtNombre = new JTextField();
			GridBagConstraints gbc_txtNombre = new GridBagConstraints();
			gbc_txtNombre.gridwidth = 2;
			gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
			gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtNombre.gridx = 2;
			gbc_txtNombre.gridy = 2;
			frame.getContentPane().add(txtNombre, gbc_txtNombre);
			txtNombre.setColumns(10);
		}
		{
			lblTelfono = new JLabel("Tel\u00E9fono");
			GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
			gbc_lblTelfono.anchor = GridBagConstraints.EAST;
			gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelfono.gridx = 1;
			gbc_lblTelfono.gridy = 3;
			frame.getContentPane().add(lblTelfono, gbc_lblTelfono);
		}
		{
			MaskFormatter formatoTlfno;
			try {
				formatoTlfno = new MaskFormatter("###' ###' ###");
				formatoTlfno.setPlaceholderCharacter('*');
			} catch (ParseException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		{
			txtTelefono = new JTextField();
			GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
			gbc_txtTelefono.gridwidth = 2;
			gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
			gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtTelefono.gridx = 2;
			gbc_txtTelefono.gridy = 3;
			frame.getContentPane().add(txtTelefono, gbc_txtTelefono);
			txtTelefono.setColumns(10);
		}
		{
			lblDireccin = new JLabel("Direcci\u00F3n");
			GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
			gbc_lblDireccin.anchor = GridBagConstraints.EAST;
			gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
			gbc_lblDireccin.gridx = 1;
			gbc_lblDireccin.gridy = 4;
			frame.getContentPane().add(lblDireccin, gbc_lblDireccin);
		}
		{
			txtDireccion = new JTextField();
			GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
			gbc_txtDireccion.gridwidth = 2;
			gbc_txtDireccion.insets = new Insets(0, 0, 5, 5);
			gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtDireccion.gridx = 2;
			gbc_txtDireccion.gridy = 4;
			frame.getContentPane().add(txtDireccion, gbc_txtDireccion);
			txtDireccion.setColumns(10);
		}
		{
			lblCdigoPostal = new JLabel("C\u00F3digo Postal");
			GridBagConstraints gbc_lblCdigoPostal = new GridBagConstraints();
			gbc_lblCdigoPostal.anchor = GridBagConstraints.EAST;
			gbc_lblCdigoPostal.insets = new Insets(0, 0, 5, 5);
			gbc_lblCdigoPostal.gridx = 1;
			gbc_lblCdigoPostal.gridy = 5;
			frame.getContentPane().add(lblCdigoPostal, gbc_lblCdigoPostal);
		}
		{
			MaskFormatter formatoCP;
			try {
				formatoCP = new MaskFormatter(" #####");
				formatoCP.setPlaceholderCharacter('*');
			} catch (ParseException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		{
			btnAadir = new JButton("A\u00F1adir");
			btnAadir.addActionListener(new GuardarClienteActionListener());
			{
				txtCodigo = new JTextField();
				GridBagConstraints gbc_txtCodigo = new GridBagConstraints();
				gbc_txtCodigo.insets = new Insets(0, 0, 5, 5);
				gbc_txtCodigo.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCodigo.gridx = 2;
				gbc_txtCodigo.gridy = 5;
				frame.getContentPane().add(txtCodigo, gbc_txtCodigo);
				txtCodigo.setColumns(10);
			}

			GridBagConstraints gbc_btnAadir = new GridBagConstraints();
			gbc_btnAadir.gridheight = 2;
			gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
			gbc_btnAadir.gridx = 3;
			gbc_btnAadir.gridy = 6;
			frame.getContentPane().add(btnAadir, gbc_btnAadir);
		}
	}
	private class GuardarClienteActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
	
			try {
				GestorAnadirCliente.guardarContacto(txtNombre.getText(),Integer.parseInt(txtTelefono.getText()),txtDireccion.getText(),Integer.parseInt(txtCodigo.getText()));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
