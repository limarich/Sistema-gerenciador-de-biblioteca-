package views;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.Color;

public class ViewCadastrarCliente extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastrarCliente frame = new ViewCadastrarCliente();
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
	public ViewCadastrarCliente() {
		setMaximizable(true);
		setResizable(true);
		getContentPane().setBackground(new Color(221, 161, 94));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setClosable(true);
		setBounds(0, 0, screenSize.width, screenSize.height);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("meu botão");
		btnNewButton.setBackground(new Color(221, 161, 94));
		btnNewButton.setBounds(428, 277, 256, 96);
		getContentPane().add(btnNewButton);

	}
}
