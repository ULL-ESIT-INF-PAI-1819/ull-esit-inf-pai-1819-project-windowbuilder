package examplesWB;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tresenraya2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tresenraya2 frame = new tresenraya2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tresenraya2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JLabel label = new JLabel("");
		
		JPanel panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				label.setText("X");
			}
		});
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_3);
		
		
		label.setFont(new Font("Tahoma", Font.PLAIN, 89));
		panel_3.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.add(panel_10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblLeTocaAl = new JLabel("Le toca al jugador X");
		panel_1.add(lblLeTocaAl);
	}

}
