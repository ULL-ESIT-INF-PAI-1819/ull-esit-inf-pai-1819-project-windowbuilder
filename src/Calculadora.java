package examplesWB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Calculadora {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(5, 5));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(5, 5));
		
		textField = new JTextField();
		panel.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton_16 = new JButton("Delete");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText().substring(0, textField.getText().length()-1));
			}
		});
		panel.add(btnNewButton_16, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {125, 125, 125, 50};
		gbl_panel_1.rowHeights = new int[]{59, 59, 59, 59, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 0;
		panel_1.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 0;
		panel_1.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 0;
		panel_1.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("/");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"/");
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 3;
		gbc_btnNewButton_4.gridy = 0;
		panel_1.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		panel_1.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 1;
		gbc_btnNewButton_5.gridy = 1;
		panel_1.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 2;
		gbc_btnNewButton_6.gridy = 1;
		panel_1.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("X");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"X");
			}
		});
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_8.gridx = 3;
		gbc_btnNewButton_8.gridy = 1;
		panel_1.add(btnNewButton_8, gbc_btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("1");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 0;
		gbc_btnNewButton_7.gridy = 2;
		panel_1.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_9.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_9.gridx = 1;
		gbc_btnNewButton_9.gridy = 2;
		panel_1.add(btnNewButton_9, gbc_btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		GridBagConstraints gbc_btnNewButton_10 = new GridBagConstraints();
		gbc_btnNewButton_10.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_10.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_10.gridx = 2;
		gbc_btnNewButton_10.gridy = 2;
		panel_1.add(btnNewButton_10, gbc_btnNewButton_10);
		
		JButton btnNewButton_14 = new JButton("-");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"-");
			}
		});
		GridBagConstraints gbc_btnNewButton_14 = new GridBagConstraints();
		gbc_btnNewButton_14.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_14.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_14.gridx = 3;
		gbc_btnNewButton_14.gridy = 2;
		panel_1.add(btnNewButton_14, gbc_btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton(",");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+",");
			}
		});
		GridBagConstraints gbc_btnNewButton_15 = new GridBagConstraints();
		gbc_btnNewButton_15.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_15.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_15.gridx = 0;
		gbc_btnNewButton_15.gridy = 3;
		panel_1.add(btnNewButton_15, gbc_btnNewButton_15);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		GridBagConstraints gbc_btnNewButton_11 = new GridBagConstraints();
		gbc_btnNewButton_11.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_11.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_11.gridx = 1;
		gbc_btnNewButton_11.gridy = 3;
		panel_1.add(btnNewButton_11, gbc_btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"=");
			}
		});
		GridBagConstraints gbc_btnNewButton_13 = new GridBagConstraints();
		gbc_btnNewButton_13.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_13.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_13.gridx = 2;
		gbc_btnNewButton_13.gridy = 3;
		panel_1.add(btnNewButton_13, gbc_btnNewButton_13);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"+");
			}
		});
		GridBagConstraints gbc_btnNewButton_12 = new GridBagConstraints();
		gbc_btnNewButton_12.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_12.gridx = 3;
		gbc_btnNewButton_12.gridy = 3;
		panel_1.add(btnNewButton_12, gbc_btnNewButton_12);
	}

}
