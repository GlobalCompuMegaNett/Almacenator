package iteracion5.presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class GenerarPedido_Interfaz {

	private JFrame frame;
	private JPanel panel;
	private JComboBox cbClientes;
	private JButton btnGenerarPedido;
	private JComboBox cbPedido;
	private JTextArea taFactura;
	private JButton btnSeleccionarCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GenerarPedido_Interfaz window = new GenerarPedido_Interfaz();
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
	public GenerarPedido_Interfaz() {
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
			gbl_panel.columnWidths = new int[]{38, 110, 143, 100, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				cbClientes = new JComboBox();
				GridBagConstraints gbc_cbClientes = new GridBagConstraints();
				gbc_cbClientes.insets = new Insets(0, 0, 5, 5);
				gbc_cbClientes.fill = GridBagConstraints.HORIZONTAL;
				gbc_cbClientes.gridx = 1;
				gbc_cbClientes.gridy = 1;
				panel.add(cbClientes, gbc_cbClientes);
			}
			{
				cbPedido = new JComboBox();
				GridBagConstraints gbc_cbPedido = new GridBagConstraints();
				gbc_cbPedido.insets = new Insets(0, 0, 5, 5);
				gbc_cbPedido.fill = GridBagConstraints.HORIZONTAL;
				gbc_cbPedido.gridx = 3;
				gbc_cbPedido.gridy = 1;
				panel.add(cbPedido, gbc_cbPedido);
			}
			{
				taFactura = new JTextArea();
				GridBagConstraints gbc_taFactura = new GridBagConstraints();
				gbc_taFactura.insets = new Insets(0, 0, 5, 5);
				gbc_taFactura.fill = GridBagConstraints.BOTH;
				gbc_taFactura.gridx = 2;
				gbc_taFactura.gridy = 2;
				panel.add(taFactura, gbc_taFactura);
			}
			{
				btnSeleccionarCliente = new JButton("Seleccionar Cliente");
				GridBagConstraints gbc_btnSeleccionarCliente = new GridBagConstraints();
				gbc_btnSeleccionarCliente.anchor = GridBagConstraints.WEST;
				gbc_btnSeleccionarCliente.gridwidth = 2;
				gbc_btnSeleccionarCliente.insets = new Insets(0, 0, 5, 5);
				gbc_btnSeleccionarCliente.gridx = 1;
				gbc_btnSeleccionarCliente.gridy = 3;
				panel.add(btnSeleccionarCliente, gbc_btnSeleccionarCliente);
			}
			{
				btnGenerarPedido = new JButton("Generar Pedido");
				GridBagConstraints gbc_btnGenerarPedido = new GridBagConstraints();
				gbc_btnGenerarPedido.insets = new Insets(0, 0, 5, 5);
				gbc_btnGenerarPedido.gridx = 3;
				gbc_btnGenerarPedido.gridy = 3;
				panel.add(btnGenerarPedido, gbc_btnGenerarPedido);
			}
		}
	}

}
