package sushi;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingGUITest extends JFrame {

	private JPanel contentPane;
	private Counter c;
	private float clockTime;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingGUITest frame = new SwingGUITest();
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
	public SwingGUITest() {
		c = new Counter();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Current amount:");
		lblNewLabel.setBounds(12, 13, 97, 22);
		contentPane.add(lblNewLabel);
		lblNewLabel.setOpaque(true);
		
		JLabel lblNewLabel_3 = new JLabel("Current rate:");
		lblNewLabel_3.setBounds(12, 60, 75, 22);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setOpaque(true);
		
		JLabel lblam = new JLabel("(am)");
		lblam.setHorizontalAlignment(SwingConstants.RIGHT);
		lblam.setOpaque(true);
		lblam.setForeground(Color.BLACK);
		lblam.setBackground(Color.WHITE);
		lblam.setBounds(121, 13, 103, 22);
		contentPane.add(lblam);
		final Timer amountTimer = new Timer(1000, new ActionListener() {
			int labelTime = 0;
			public void actionPerformed(ActionEvent timeEvent) {
				lblam.setText(Integer.toString(labelTime));
				labelTime++;
			}
		});
		
		amountTimer.setRepeats(true);
		amountTimer.start();
		
		JLabel lblr = new JLabel("(r)");
		lblr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblr.setBackground(Color.WHITE);
		lblr.setOpaque(true);
		lblr.setBounds(121, 60, 103, 22);
		contentPane.add(lblr);
		
		JButton btnNewButton_1 = new JButton("Test 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			int amountToBuy = 0;
			public void actionPerformed(ActionEvent buyEvent) {
				amountToBuy++;
				lblr.setText(Integer.toString(amountToBuy));
			}
		});
		btnNewButton_1.setBounds(127, 198, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnStartClockButton = new JButton("Start Clock");
		btnStartClockButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.startClock();
			}
		});
		btnStartClockButton.setBounds(12, 198, 97, 25);
		contentPane.add(btnStartClockButton);
	}
}
