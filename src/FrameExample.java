package examplesWB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameExample {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameExample window = new FrameExample();
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
	public FrameExample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Introduzca Cuant\u00EDa, tipo de inter\u00E9s y a\u00F1os", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 169, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblTipoDeInters = new JLabel("Tipo de inter\u00E9s (%)");
		GridBagConstraints gbc_lblTipoDeInters = new GridBagConstraints();
		gbc_lblTipoDeInters.anchor = GridBagConstraints.WEST;
		gbc_lblTipoDeInters.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeInters.gridx = 0;
		gbc_lblTipoDeInters.gridy = 0;
		panel.add(lblTipoDeInters, gbc_lblTipoDeInters);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNmerosDeAos = new JLabel("N\u00FAmeros de a\u00F1os");
		GridBagConstraints gbc_lblNmerosDeAos = new GridBagConstraints();
		gbc_lblNmerosDeAos.anchor = GridBagConstraints.WEST;
		gbc_lblNmerosDeAos.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmerosDeAos.gridx = 0;
		gbc_lblNmerosDeAos.gridy = 1;
		panel.add(lblNmerosDeAos, gbc_lblNmerosDeAos);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCuantaDelPrstamo = new JLabel("Cuant\u00EDa del Pr\u00E9stamo");
		GridBagConstraints gbc_lblCuantaDelPrstamo = new GridBagConstraints();
		gbc_lblCuantaDelPrstamo.anchor = GridBagConstraints.WEST;
		gbc_lblCuantaDelPrstamo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCuantaDelPrstamo.gridx = 0;
		gbc_lblCuantaDelPrstamo.gridy = 2;
		panel.add(lblCuantaDelPrstamo, gbc_lblCuantaDelPrstamo);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCuotaMensual = new JLabel("Cuota mensual");
		GridBagConstraints gbc_lblCuotaMensual = new GridBagConstraints();
		gbc_lblCuotaMensual.anchor = GridBagConstraints.WEST;
		gbc_lblCuotaMensual.insets = new Insets(0, 0, 5, 5);
		gbc_lblCuotaMensual.gridx = 0;
		gbc_lblCuotaMensual.gridy = 3;
		panel.add(lblCuotaMensual, gbc_lblCuotaMensual);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar");
		GridBagConstraints gbc_lblTotalAPagar = new GridBagConstraints();
		gbc_lblTotalAPagar.anchor = GridBagConstraints.WEST;
		gbc_lblTotalAPagar.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalAPagar.gridx = 0;
		gbc_lblTotalAPagar.gridy = 4;
		panel.add(lblTotalAPagar, gbc_lblTotalAPagar);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 8;
		panel.add(btnNewButton, gbc_btnNewButton);
	}

}
