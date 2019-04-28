import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class TresEnRaya2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TresEnRaya2 frame = new TresEnRaya2();
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
	public TresEnRaya2() {
		setSize(new Dimension(500, 500));
		setBounds(new Rectangle(0, 34, 500, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(0, 0, 500, 500));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelDeCasillas = new JPanel();
		contentPane.add(panelDeCasillas, BorderLayout.CENTER);
		panelDeCasillas.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panelDeCasillas.add(panel_1);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//Accion al pulsar la casilla 1
			}
		});
		
		
		
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JPanel panel_2 = new JPanel();
		panelDeCasillas.add(panel_2);
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JPanel panel = new JPanel();
		panelDeCasillas.add(panel);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JPanel panel_3 = new JPanel();
		panelDeCasillas.add(panel_3);
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JPanel panel_4 = new JPanel();
		panelDeCasillas.add(panel_4);
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JPanel panel_5 = new JPanel();
		panelDeCasillas.add(panel_5);
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JPanel panel_6 = new JPanel();
		panelDeCasillas.add(panel_6);
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JPanel panel_7 = new JPanel();
		panelDeCasillas.add(panel_7);
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JPanel panel_8 = new JPanel();
		panelDeCasillas.add(panel_8);
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.SOUTH);
	}

}
