package iteracion1.presentacion;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JPasswordField;

public class Login_Interfaz {

	private JFrame frame;
	private JPanel panel;
	private JTextField txtNombre;
	private JLabel lblNombre;
	private JPasswordField pwdContrasenia;

	private JLabel lblContrasea;
	private JButton btnEntrar;
	private JLabel lblFoto;
	private JLabel lblAviso;
	private String nombre="Usuario";
	private String contrasenia="Contraseña";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Interfaz window = new Login_Interfaz();
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
	public Login_Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Recursos/brown-box-paper-cartoon-package-cardboard-closed-boxes-taped_f.jpg"));
		frame.setBounds(100, 100, 503, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			frame.getContentPane().add(panel, BorderLayout.CENTER);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{43, 0, 52, 44, 47, 47, 0};
			gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				lblFoto = new JLabel("");
				lblFoto.setIcon(new ImageIcon("src/Recursos/shipping-container-model-toy-ex-stock-gift-items-plastic-CCNI-container-model-in-scale-1-20.jpg_200x200.jpg"));
				GridBagConstraints gbc_lblFoto = new GridBagConstraints();
				gbc_lblFoto.gridwidth = 5;
				gbc_lblFoto.gridheight = 6;
				gbc_lblFoto.insets = new Insets(0, 0, 0, 5);
				gbc_lblFoto.gridx = 1;
				gbc_lblFoto.gridy = 0;
				panel.add(lblFoto, gbc_lblFoto);
			}
			{
				lblNombre = new JLabel("Nombre");
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 7;
				gbc_lblNombre.gridy = 1;
				panel.add(lblNombre, gbc_lblNombre);
			}
			{
				txtNombre = new JTextField();
				GridBagConstraints gbc_txtNombre = new GridBagConstraints();
				gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
				gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtNombre.gridx = 8;
				gbc_txtNombre.gridy = 1;
				panel.add(txtNombre, gbc_txtNombre);
				txtNombre.setColumns(10);
			}
			{
				lblContrasea = new JLabel("Contrase\u00F1a");
				GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
				gbc_lblContrasea.anchor = GridBagConstraints.EAST;
				gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
				gbc_lblContrasea.gridx = 7;
				gbc_lblContrasea.gridy = 2;
				panel.add(lblContrasea, gbc_lblContrasea);
			}
			{
				btnEntrar = new JButton("Entrar");
				btnEntrar.addActionListener(new AutenticarActionPerformed());
				{
					pwdContrasenia = new JPasswordField();
					GridBagConstraints gbc_pwdContrasenia = new GridBagConstraints();
					gbc_pwdContrasenia.insets = new Insets(0, 0, 5, 5);
					gbc_pwdContrasenia.fill = GridBagConstraints.HORIZONTAL;
					gbc_pwdContrasenia.gridx = 8;
					gbc_pwdContrasenia.gridy = 2;
					panel.add(pwdContrasenia, gbc_pwdContrasenia);
				}
				{
					lblAviso = new JLabel("");
					lblAviso.setVisible(false);
					GridBagConstraints gbc_lblAviso = new GridBagConstraints();
					gbc_lblAviso.insets = new Insets(0, 0, 5, 5);
					gbc_lblAviso.gridx = 8;
					gbc_lblAviso.gridy = 4;
					panel.add(lblAviso, gbc_lblAviso);
				}
				GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
				gbc_btnEntrar.insets = new Insets(0, 0, 0, 5);
				gbc_btnEntrar.gridx = 8;
				gbc_btnEntrar.gridy = 5;
				panel.add(btnEntrar, gbc_btnEntrar);
			}
		}
	}
	
	
	private class AutenticarActionPerformed implements ActionListener{
		public void actionPerformed	(ActionEvent e) {
		//obtenemos la contraseña introducida
			if(String.valueOf(pwdContrasenia.getPassword()).toString().equals(contrasenia) && String.valueOf(txtNombre.getText()).toString().equals(nombre)){
				lblAviso.setBackground(Color.GREEN);
				lblAviso.setText("Contraseña correcta.");
				lblAviso.setVisible(true);
			}else {
				lblAviso.setBackground(Color.RED);
				lblAviso.setText("Contraseña incorrecta.");
				lblAviso.setVisible(true);
			}
		}
	}	
}
