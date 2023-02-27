package views;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class ViewCadastrarLivro extends JInternalFrame {
	private JTextField txtAa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastrarLivro frame = new ViewCadastrarLivro();
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
	public ViewCadastrarLivro() {
		getContentPane().setBackground(new Color(221, 161, 94));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setClosable(true);
		setBounds(0, 0, screenSize.width, screenSize.height);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Livro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblNewLabel.setBounds(546, 199, 537, 105);
		getContentPane().add(lblNewLabel);
		
		txtAa = new JTextField();
		txtAa.setToolTipText("Nome do Livro");
		txtAa.setBounds(497, 432, 468, 51);
		getContentPane().add(txtAa);
		txtAa.setColumns(10);

	}
}
