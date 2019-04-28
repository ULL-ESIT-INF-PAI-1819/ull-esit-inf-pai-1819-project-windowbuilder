package examplesWB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.GridBagLayout;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import java.awt.Color;

public class CurrencyChanger {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyChanger window = new CurrencyChanger();
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
	public CurrencyChanger() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "DM", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel label_3 = new JLabel("1 Euro is ");
		panel_4.add(label_3);
		
		JLabel label_4 = new JLabel("1,69");
		label_4.setBorder(new LineBorder(Color.BLACK, 1));
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("DM");
		panel_4.add(label_5);
		
		JPanel panel_5 = new JPanel();
		panel_3.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_6 = new JLabel("Euro");
		panel_5.add(label_6);
		
		JLabel label_7 = new JLabel("DM");
		panel_5.add(label_7);
		
		JPanel panel_6 = new JPanel();
		panel_3.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_8 = new JLabel("0,00");
		label_8.setBorder(new LineBorder(Color.BLACK, 1));
		panel_6.add(label_8);
		
		JLabel lblNewLabel = new JLabel("0,00");
		lblNewLabel.setBorder(new LineBorder(Color.BLACK, 1));
		panel_6.add(lblNewLabel);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Belg. Franc", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel label_9 = new JLabel("1 Euro is ");
		panel_8.add(label_9);
		
		JLabel label_10 = new JLabel("40,34");
		label_10.setBorder(new LineBorder(Color.BLACK, 1));
		panel_8.add(label_10);
		
		JLabel lblBelgFranc = new JLabel("Belg. Franc");
		panel_8.add(lblBelgFranc);
		
		JPanel panel_9 = new JPanel();
		panel_7.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_12 = new JLabel("Euro");
		panel_9.add(label_12);
		
		JLabel lblBelgFranc_1 = new JLabel("Belg. Franc");
		panel_9.add(lblBelgFranc_1);
		
		JPanel panel_10 = new JPanel();
		panel_7.add(panel_10);
		panel_10.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_14 = new JLabel("0,00");
		label_14.setBorder(new LineBorder(Color.BLACK, 1));
		panel_10.add(label_14);
		
		JLabel label_15 = new JLabel("0,00");
		label_15.setBorder(new LineBorder(Color.BLACK, 1));
		panel_10.add(label_15);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Franz. Franc", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_11.add(panel_12);
		panel_12.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel label_16 = new JLabel("1 Euro is ");
		panel_12.add(label_16);
		
		JLabel label_17 = new JLabel("6,56");
		label_17.setBorder(new LineBorder(Color.BLACK, 1));
		panel_12.add(label_17);
		
		JLabel lblFranzFranc = new JLabel("Franz. Franc");
		panel_12.add(lblFranzFranc);
		
		JPanel panel_13 = new JPanel();
		panel_11.add(panel_13);
		panel_13.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_19 = new JLabel("Euro");
		panel_13.add(label_19);
		
		JLabel lblFranzFranc_1 = new JLabel("Franz. Franc");
		panel_13.add(lblFranzFranc_1);
		
		JPanel panel_14 = new JPanel();
		panel_11.add(panel_14);
		panel_14.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_21 = new JLabel("0,00");
		label_21.setBorder(new LineBorder(Color.BLACK, 1));
		panel_14.add(label_21);
		
		JLabel label_22 = new JLabel("0,00");
		label_22.setBorder(new LineBorder(Color.BLACK, 1));
		panel_14.add(label_22);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ir. Pfund", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_15);
		panel_15.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_16 = new JPanel();
		panel_15.add(panel_16);
		panel_16.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel label_23 = new JLabel("1 Euro is ");
		panel_16.add(label_23);
		
		JLabel label_24 = new JLabel("0,79");
		label_24.setBorder(new LineBorder(Color.BLACK, 1));
		panel_16.add(label_24);
		
		JLabel lblIrPfund = new JLabel("Ir. Pfund");
		panel_16.add(lblIrPfund);
		
		JPanel panel_17 = new JPanel();
		panel_15.add(panel_17);
		panel_17.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_26 = new JLabel("Euro");
		panel_17.add(label_26);
		
		JLabel lblIrPfund_1 = new JLabel("Ir. Pfund");
		panel_17.add(lblIrPfund_1);
		
		JPanel panel_18 = new JPanel();
		panel_15.add(panel_18);
		panel_18.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_28 = new JLabel("0,00");
		label_28.setBorder(new LineBorder(Color.BLACK, 1));
		panel_18.add(label_28);
		
		JLabel label_29 = new JLabel("0,00");
		label_29.setBorder(new LineBorder(Color.BLACK, 1));
		panel_18.add(label_29);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ital. Lira", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel_19);
		panel_19.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_19.add(panel_20);
		panel_20.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel label_30 = new JLabel("1 Euro is ");
		panel_20.add(label_30);
		
		JLabel label_31 = new JLabel("1.936,27");
		label_31.setBorder(new LineBorder(Color.BLACK, 1));
		panel_20.add(label_31);
		
		JLabel lblItalLira = new JLabel("Ital. Lira");
		panel_20.add(lblItalLira);
		
		JPanel panel_21 = new JPanel();
		panel_19.add(panel_21);
		panel_21.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_33 = new JLabel("Euro");
		panel_21.add(label_33);
		
		JLabel lblItalLira_1 = new JLabel("Ital. Lira");
		panel_21.add(lblItalLira_1);
		
		JPanel panel_22 = new JPanel();
		panel_19.add(panel_22);
		panel_22.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_35 = new JLabel("0,00");
		label_35.setBorder(new LineBorder(Color.BLACK, 1));
		panel_22.add(label_35);
		
		JLabel label_36 = new JLabel("0,00");
		label_36.setBorder(new LineBorder(Color.BLACK, 1));
		panel_22.add(label_36);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "US $", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel label = new JLabel("1 Euro is ");
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("1,06");
		label_1.setBorder(new LineBorder(Color.BLACK, 1));
		panel_1.add(label_1);
		
		JLabel lblUs = new JLabel("US $");
		panel_1.add(lblUs);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_37 = new JLabel("Euro");
		panel_2.add(label_37);
		
		JLabel lblUs_1 = new JLabel("US $");
		panel_2.add(lblUs_1);
		
		JPanel panel_23 = new JPanel();
		panel.add(panel_23);
		panel_23.setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel label_39 = new JLabel("0,00");
		label_39.setBorder(new LineBorder(Color.BLACK, 1));
		panel_23.add(label_39);
		
		JLabel label_40 = new JLabel("0,00");
		label_40.setBorder(new LineBorder(Color.BLACK, 1));
		panel_23.add(label_40);
	}

}
