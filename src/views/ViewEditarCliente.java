package views;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class ViewEditarCliente extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEditarCliente frame = new ViewEditarCliente();
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
	public ViewEditarCliente() {
		setClosable(true);
		setBounds(100, 100, 450, 300);

	}

}
