package iteracion4.presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Almacenar_Interfaz {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblSeleccionarCliente;
	private JComboBox<Object> comboBox;
	private JLabel lblPedido;
	private JLabel lblCocacola;
	private JLabel lblPepsi;
	private JLabel lblFantaNaranja;
	private JLabel lblFantaLimn;
	private JLabel lblSprite;
	private JLabel lblTonica;
	private JTextField txtCoca;
	private JTextField txtPepsi;
	private JTextField txtFantaN;
	private JTextField txtFantaL;
	private JTextField txtSprite;
	private JTextField txtTonica;
	private JButton btnAlmacenar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Almacenar_Interfaz window = new Almacenar_Interfaz();
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
	public Almacenar_Interfaz() {
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
			gbl_panel.columnWidths = new int[]{0, 0, 114, 107, 0, 0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				lblSeleccionarCliente = new JLabel("Seleccionar Cliente:");
				GridBagConstraints gbc_lblSeleccionarCliente = new GridBagConstraints();
				gbc_lblSeleccionarCliente.insets = new Insets(0, 0, 5, 5);
				gbc_lblSeleccionarCliente.anchor = GridBagConstraints.EAST;
				gbc_lblSeleccionarCliente.gridx = 1;
				gbc_lblSeleccionarCliente.gridy = 1;
				panel.add(lblSeleccionarCliente, gbc_lblSeleccionarCliente);
			}
			{
				comboBox = new JComboBox<Object>();
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				comboBox.setModel(new DefaultComboBoxModel<Object>(ListadeClientes()));
				gbc_comboBox.gridwidth = 2;
				gbc_comboBox.insets = new Insets(0, 0, 5, 5);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 2;
				gbc_comboBox.gridy = 1;
				panel.add(comboBox, gbc_comboBox);
			}
			{
				lblPedido = new JLabel("N\u00BA Pedido");
				GridBagConstraints gbc_lblPedido = new GridBagConstraints();
				gbc_lblPedido.insets = new Insets(0, 0, 5, 5);
				gbc_lblPedido.gridx = 1;
				gbc_lblPedido.gridy = 2;
				panel.add(lblPedido, gbc_lblPedido);
			}
			{
				lblCocacola = new JLabel("Coca-cola:");
				GridBagConstraints gbc_lblCocacola = new GridBagConstraints();
				gbc_lblCocacola.anchor = GridBagConstraints.EAST;
				gbc_lblCocacola.insets = new Insets(0, 0, 5, 5);
				gbc_lblCocacola.gridx = 2;
				gbc_lblCocacola.gridy = 3;
				panel.add(lblCocacola, gbc_lblCocacola);
			}
			{
				txtCoca = new JTextField();
				GridBagConstraints gbc_txtCoca = new GridBagConstraints();
				gbc_txtCoca.anchor = GridBagConstraints.NORTH;
				gbc_txtCoca.insets = new Insets(0, 0, 5, 5);
				gbc_txtCoca.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCoca.gridx = 3;
				gbc_txtCoca.gridy = 3;
				panel.add(txtCoca, gbc_txtCoca);
				txtCoca.setColumns(10);
			}
			{
				lblPepsi = new JLabel("Pepsi:");
				GridBagConstraints gbc_lblPepsi = new GridBagConstraints();
				gbc_lblPepsi.anchor = GridBagConstraints.EAST;
				gbc_lblPepsi.insets = new Insets(0, 0, 5, 5);
				gbc_lblPepsi.gridx = 2;
				gbc_lblPepsi.gridy = 4;
				panel.add(lblPepsi, gbc_lblPepsi);
			}
			{
				txtPepsi = new JTextField();
				GridBagConstraints gbc_txtPepsi = new GridBagConstraints();
				gbc_txtPepsi.insets = new Insets(0, 0, 5, 5);
				gbc_txtPepsi.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtPepsi.gridx = 3;
				gbc_txtPepsi.gridy = 4;
				panel.add(txtPepsi, gbc_txtPepsi);
				txtPepsi.setColumns(10);
			}
			{
				lblFantaNaranja = new JLabel("Fanta Naranja:");
				GridBagConstraints gbc_lblFantaNaranja = new GridBagConstraints();
				gbc_lblFantaNaranja.anchor = GridBagConstraints.EAST;
				gbc_lblFantaNaranja.insets = new Insets(0, 0, 5, 5);
				gbc_lblFantaNaranja.gridx = 2;
				gbc_lblFantaNaranja.gridy = 5;
				panel.add(lblFantaNaranja, gbc_lblFantaNaranja);
			}
			{
				txtFantaN = new JTextField();
				GridBagConstraints gbc_txtFantaN = new GridBagConstraints();
				gbc_txtFantaN.insets = new Insets(0, 0, 5, 5);
				gbc_txtFantaN.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtFantaN.gridx = 3;
				gbc_txtFantaN.gridy = 5;
				panel.add(txtFantaN, gbc_txtFantaN);
				txtFantaN.setColumns(10);
			}
			{
				lblFantaLimn = new JLabel("Fanta Lim\u00F3n:");
				GridBagConstraints gbc_lblFantaLimn = new GridBagConstraints();
				gbc_lblFantaLimn.anchor = GridBagConstraints.EAST;
				gbc_lblFantaLimn.insets = new Insets(0, 0, 5, 5);
				gbc_lblFantaLimn.gridx = 2;
				gbc_lblFantaLimn.gridy = 6;
				panel.add(lblFantaLimn, gbc_lblFantaLimn);
			}
			{
				txtFantaL = new JTextField();
				GridBagConstraints gbc_txtFantaL = new GridBagConstraints();
				gbc_txtFantaL.insets = new Insets(0, 0, 5, 5);
				gbc_txtFantaL.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtFantaL.gridx = 3;
				gbc_txtFantaL.gridy = 6;
				panel.add(txtFantaL, gbc_txtFantaL);
				txtFantaL.setColumns(10);
			}
			{
				lblSprite = new JLabel("Sprite:");
				GridBagConstraints gbc_lblSprite = new GridBagConstraints();
				gbc_lblSprite.anchor = GridBagConstraints.EAST;
				gbc_lblSprite.insets = new Insets(0, 0, 5, 5);
				gbc_lblSprite.gridx = 2;
				gbc_lblSprite.gridy = 7;
				panel.add(lblSprite, gbc_lblSprite);
			}
			{
				txtSprite = new JTextField();
				GridBagConstraints gbc_txtSprite = new GridBagConstraints();
				gbc_txtSprite.anchor = GridBagConstraints.NORTH;
				gbc_txtSprite.insets = new Insets(0, 0, 5, 5);
				gbc_txtSprite.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtSprite.gridx = 3;
				gbc_txtSprite.gridy = 7;
				panel.add(txtSprite, gbc_txtSprite);
				txtSprite.setColumns(10);
			}
			{
				lblTonica = new JLabel("Tonica Schweppes:");
				GridBagConstraints gbc_lblTonica = new GridBagConstraints();
				gbc_lblTonica.anchor = GridBagConstraints.EAST;
				gbc_lblTonica.insets = new Insets(0, 0, 5, 5);
				gbc_lblTonica.gridx = 2;
				gbc_lblTonica.gridy = 8;
				panel.add(lblTonica, gbc_lblTonica);
			}
			{
				txtTonica = new JTextField();
				GridBagConstraints gbc_txtTonica = new GridBagConstraints();
				gbc_txtTonica.insets = new Insets(0, 0, 5, 5);
				gbc_txtTonica.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtTonica.gridx = 3;
				gbc_txtTonica.gridy = 8;
				panel.add(txtTonica, gbc_txtTonica);
				txtTonica.setColumns(10);
			}
			{
				btnAlmacenar = new JButton("Almacenar");
				btnAlmacenar.addActionListener(new BtnAlmacenar());
					
				GridBagConstraints gbc_btnAlmacenar = new GridBagConstraints();
				gbc_btnAlmacenar.insets = new Insets(0, 0, 5, 5);
				gbc_btnAlmacenar.gridx = 5;
				gbc_btnAlmacenar.gridy = 9;
				panel.add(btnAlmacenar, gbc_btnAlmacenar);
			}
		}
	}

		
	private class BtnAlmacenar implements ActionListener{
		@SuppressWarnings("null")
		public void actionPerformed(ActionEvent e) {
			int [] pedido = null;
			pedido[0]=Integer.parseInt(txtCoca.getText());
			pedido[1]=Integer.parseInt(txtPepsi.getText());
			pedido[2]=Integer.parseInt(txtFantaN.getText());
			pedido[3]=Integer.parseInt(txtFantaL.getText());
			pedido[4]=Integer.parseInt(txtSprite.getText());
			pedido[5]=Integer.parseInt(txtTonica.getText());
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
