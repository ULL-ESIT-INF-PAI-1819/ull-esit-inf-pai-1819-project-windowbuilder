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
	private JTextField InteresText;
	private JTextField AniosText;
	private JTextField CuantiaPrestamosText;
	private JTextField CuotaMensualText;
	private JTextField TotalPagarText;

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
		
		InteresText = new JTextField();
		GridBagConstraints gbc_InteresText = new GridBagConstraints();
		gbc_InteresText.insets = new Insets(0, 0, 5, 0);
		gbc_InteresText.fill = GridBagConstraints.HORIZONTAL;
		gbc_InteresText.gridx = 1;
		gbc_InteresText.gridy = 0;
		panel.add(InteresText, gbc_InteresText);
		InteresText.setColumns(10);
		
		JLabel lblNmerosDeAos = new JLabel("N\u00FAmeros de a\u00F1os");
		GridBagConstraints gbc_lblNmerosDeAos = new GridBagConstraints();
		gbc_lblNmerosDeAos.anchor = GridBagConstraints.WEST;
		gbc_lblNmerosDeAos.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmerosDeAos.gridx = 0;
		gbc_lblNmerosDeAos.gridy = 1;
		panel.add(lblNmerosDeAos, gbc_lblNmerosDeAos);
		
		AniosText = new JTextField();
		GridBagConstraints gbc_AniosText = new GridBagConstraints();
		gbc_AniosText.insets = new Insets(0, 0, 5, 0);
		gbc_AniosText.fill = GridBagConstraints.HORIZONTAL;
		gbc_AniosText.gridx = 1;
		gbc_AniosText.gridy = 1;
		panel.add(AniosText, gbc_AniosText);
		AniosText.setColumns(10);
		
		JLabel lblCuantaDelPrstamo = new JLabel("Cuant\u00EDa del Pr\u00E9stamo");
		GridBagConstraints gbc_lblCuantaDelPrstamo = new GridBagConstraints();
		gbc_lblCuantaDelPrstamo.anchor = GridBagConstraints.WEST;
		gbc_lblCuantaDelPrstamo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCuantaDelPrstamo.gridx = 0;
		gbc_lblCuantaDelPrstamo.gridy = 2;
		panel.add(lblCuantaDelPrstamo, gbc_lblCuantaDelPrstamo);
		
		CuantiaPrestamosText = new JTextField();
		GridBagConstraints gbc_CuantiaPrestamosText = new GridBagConstraints();
		gbc_CuantiaPrestamosText.insets = new Insets(0, 0, 5, 0);
		gbc_CuantiaPrestamosText.fill = GridBagConstraints.HORIZONTAL;
		gbc_CuantiaPrestamosText.gridx = 1;
		gbc_CuantiaPrestamosText.gridy = 2;
		panel.add(CuantiaPrestamosText, gbc_CuantiaPrestamosText);
		CuantiaPrestamosText.setColumns(10);
		
		JLabel lblCuotaMensual = new JLabel("Cuota mensual");
		GridBagConstraints gbc_lblCuotaMensual = new GridBagConstraints();
		gbc_lblCuotaMensual.anchor = GridBagConstraints.WEST;
		gbc_lblCuotaMensual.insets = new Insets(0, 0, 5, 5);
		gbc_lblCuotaMensual.gridx = 0;
		gbc_lblCuotaMensual.gridy = 3;
		panel.add(lblCuotaMensual, gbc_lblCuotaMensual);
		
		CuotaMensualText = new JTextField();
		GridBagConstraints gbc_CuotaMensualText = new GridBagConstraints();
		gbc_CuotaMensualText.insets = new Insets(0, 0, 5, 0);
		gbc_CuotaMensualText.fill = GridBagConstraints.HORIZONTAL;
		gbc_CuotaMensualText.gridx = 1;
		gbc_CuotaMensualText.gridy = 3;
		panel.add(CuotaMensualText, gbc_CuotaMensualText);
		CuotaMensualText.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar");
		GridBagConstraints gbc_lblTotalAPagar = new GridBagConstraints();
		gbc_lblTotalAPagar.anchor = GridBagConstraints.WEST;
		gbc_lblTotalAPagar.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalAPagar.gridx = 0;
		gbc_lblTotalAPagar.gridy = 4;
		panel.add(lblTotalAPagar, gbc_lblTotalAPagar);
		
		TotalPagarText = new JTextField();
		GridBagConstraints gbc_TotalPagarText = new GridBagConstraints();
		gbc_TotalPagarText.insets = new Insets(0, 0, 5, 0);
		gbc_TotalPagarText.fill = GridBagConstraints.HORIZONTAL;
		gbc_TotalPagarText.gridx = 1;
		gbc_TotalPagarText.gridy = 4;
		panel.add(TotalPagarText, gbc_TotalPagarText);
		TotalPagarText.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			      double interes         = Double.parseDouble(InteresText.getText());
			      int anios              = Integer.parseInt(AniosText.getText());
			      double importePrestamo = Double.parseDouble(CuantiaPrestamosText.getText());

			      double tipoInteresMensual = interes / 1200;
			      double cuotaMensual = importePrestamo * tipoInteresMensual / (1 - (Math.pow(1 / (1 + tipoInteresMensual), anios * 12)));
			      double importeTotal = cuotaMensual * anios * 12;
			      CuotaMensualText.setText(String.format("%.2f", cuotaMensual));
			      TotalPagarText.setText(String.format("%.2f", importeTotal));
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 8;
		panel.add(btnNewButton, gbc_btnNewButton);
	}

}
