package views;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class ViewDevolverLivro extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDevolverLivro frame = new ViewDevolverLivro();
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
	public ViewDevolverLivro() {
		setClosable(true);
		setBounds(100, 100, 450, 300);

	}

}
