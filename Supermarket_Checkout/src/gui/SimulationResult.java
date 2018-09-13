package gui;

import javax.swing.JFrame;

public class SimulationResult {

	private JFrame frmSimulationresult;

	/**
	 * Launch the application.
	 */
			public void run() {
				try {
					SimulationResult window = new SimulationResult();
					window.frmSimulationresult.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the application.
	 */
	public SimulationResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimulationresult = new JFrame();
		frmSimulationresult.setTitle("SimulationResult");
		frmSimulationresult.setBounds(100, 100, 834, 637);
		frmSimulationresult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimulationresult.getContentPane().setLayout(null);
	}

}
