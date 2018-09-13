package gui;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import gui.SimulationResult;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frmMenu;
	private JTextField lbl_checkoutNum;
	private JTextField tf_min_productNum;
	private JTextField tf_max_productNum;
	private JTextField tf_min_productTime;
	private JTextField tf_max_productTime;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Menu window = new Menu();
			window.frmMenu.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 1221, 736);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		lbl_checkoutNum = new JTextField();
		lbl_checkoutNum.setBounds(423, 150, 173, 30);
		frmMenu.getContentPane().add(lbl_checkoutNum);
		lbl_checkoutNum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Number of Checkouts (1 to 8) :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(47, 135, 330, 51);
		frmMenu.getContentPane().add(lblNewLabel);
		
		JLabel lblSupermarketCheckout = new JLabel("Supermarket Checkout Simulation");
		lblSupermarketCheckout.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblSupermarketCheckout.setBounds(332, 40, 507, 51);
		frmMenu.getContentPane().add(lblSupermarketCheckout);
		
		JLabel lblT = new JLabel("The range of the number of products for each trolley ( 1 to 200 ) :\r\n");
		lblT.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblT.setBounds(47, 213, 695, 57);
		frmMenu.getContentPane().add(lblT);
		
		tf_min_productNum = new JTextField();
		tf_min_productNum.setBounds(752, 231, 57, 30);
		frmMenu.getContentPane().add(tf_min_productNum);
		tf_min_productNum.setColumns(10);
		
		JLabel lbl_to_1 = new JLabel("to");
		lbl_to_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lbl_to_1.setBounds(831, 231, 32, 31);
		frmMenu.getContentPane().add(lbl_to_1);
		
		tf_max_productNum = new JTextField();
		tf_max_productNum.setColumns(10);
		tf_max_productNum.setBounds(873, 231, 57, 30);
		frmMenu.getContentPane().add(tf_max_productNum);
		
		JLabel lblTheRangeOf = new JLabel("The range of the time for each product to be entered at the checkout ( 0.5 to 6 ) :\r\n");
		lblTheRangeOf.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTheRangeOf.setBounds(47, 293, 872, 57);
		frmMenu.getContentPane().add(lblTheRangeOf);
		
		tf_min_productTime = new JTextField();
		tf_min_productTime.setColumns(10);
		tf_min_productTime.setBounds(929, 309, 57, 30);
		frmMenu.getContentPane().add(tf_min_productTime);
		
		JLabel lbl_to_2 = new JLabel("to");
		lbl_to_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lbl_to_2.setBounds(1005, 308, 32, 31);
		frmMenu.getContentPane().add(lbl_to_2);
		
		tf_max_productTime = new JTextField();
		tf_max_productTime.setColumns(10);
		tf_max_productTime.setBounds(1041, 309, 57, 30);
		frmMenu.getContentPane().add(tf_max_productTime);
		
		JButton btn_startSimulation = new JButton("Start Simulation");
		btn_startSimulation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimulationResult sr = new SimulationResult();
				sr.run();
			}
		});
		btn_startSimulation.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btn_startSimulation.setBounds(409, 522, 333, 57);
		frmMenu.getContentPane().add(btn_startSimulation);
	}
}
