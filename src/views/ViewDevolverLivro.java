package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;

public class ViewDevolverLivro extends JInternalFrame {
	private JButton btnNewButton_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String cpf) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDevolverLivro frame = new ViewDevolverLivro(cpf);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param cpf 
	 */
	public ViewDevolverLivro(String cpf) {
		
		
		getContentPane().setBackground(new Color(221, 161, 94));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setClosable(true);
		setBounds(0, 0, screenSize.width, screenSize.height);
		getContentPane().setLayout(null);

//		 Botão Buscar - Irá fazer a query pelo cpf do usuário - o retorno deve ser uma nova pagina com a listas de livros alugados
//		JButton btnNewButton = new JButton("Teste");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
////				ViewModalBusca modalBusca = new ViewModalBusca("CPF do Usuário");
////				modalBusca.setVisible(true);
//			}
//		});
//
//		// Botão 0 - Buscar
//		btnNewButton.setForeground(Color.WHITE);
//		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
//		btnNewButton.setBackground(new Color(156, 102, 68));
//		btnNewButton.setBounds(570, 707, 284, 44);
//		getContentPane().add(btnNewButton);
		

	ViewListaExemplaresAlugados listaExemplaresAlugados = new ViewListaExemplaresAlugados(cpf);
	listaExemplaresAlugados.setVisible(true);

		// Botão voltar - 
//		btnNewButton_2 = new JButton("Voltar");
//		btnNewButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//		});
//		btnNewButton_2.setBounds(26, 36, 85, 21);
//		getContentPane().add(btnNewButton_2);

	}

}
