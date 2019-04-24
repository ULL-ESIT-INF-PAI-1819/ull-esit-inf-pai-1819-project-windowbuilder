import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import javax.swing.Box;
import java.awt.Panel;
import java.awt.Canvas;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JCheckBox;

public class Frame {

	private JFrame frame;
	private JTextField txtEstoEsUna;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
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
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<=");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("=>");
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(5, 0));
		
		JLabel lblIntroduzcaOtroMensaje = new JLabel("Introduzca un nuevo mensaje");
		panel_1.add(lblIntroduzcaOtroMensaje, BorderLayout.WEST);
		
		txtEstoEsUna = new JTextField();
		txtEstoEsUna.setText("Esto es una prueba");
		txtEstoEsUna.setToolTipText("");
		panel_1.add(txtEstoEsUna);
		txtEstoEsUna.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnRed = new JRadioButton("Rojo");
		panel_2.add(rdbtnRed);
		
		JRadioButton rdbtnAzul = new JRadioButton("Azul");
		panel_2.add(rdbtnAzul);
		
		JRadioButton rdbtnVerde = new JRadioButton("Verde");
		panel_2.add(rdbtnVerde);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		JCheckBox chckbxCentrado = new JCheckBox("Centrado");
		panel_3.add(chckbxCentrado);
		
		JCheckBox chckbxNegrita = new JCheckBox("Negrita");
		panel_3.add(chckbxNegrita);
		
		JCheckBox chckbxItlica = new JCheckBox("It\u00E1lica");
		panel_3.add(chckbxItlica);
		
		JPanel MensajePanel = new JPanel();
		MensajePanel.setToolTipText("");
		MensajePanel.setBackground(Color.WHITE);
		frame.getContentPane().add(MensajePanel, BorderLayout.CENTER);
		MensajePanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label = new JLabel("");
		MensajePanel.add(label);
		
		JLabel lblEstoEsUna = new JLabel("Esto es una prueba");
		MensajePanel.add(lblEstoEsUna);
	}
}
