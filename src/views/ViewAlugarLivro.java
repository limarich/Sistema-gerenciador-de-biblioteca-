package views;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ViewAlugarLivro extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAlugarLivro frame = new ViewAlugarLivro();
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
	public ViewAlugarLivro() {
		setIconifiable(true);
		setMaximizable(true);
		setResizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aluguel de livro");
		lblNewLabel.setBounds(174, 35, 70, 13);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Alugar");
		btnNewButton.setBounds(159, 194, 85, 21);
		getContentPane().add(btnNewButton);

	}
}
