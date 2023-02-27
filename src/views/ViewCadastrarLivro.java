package views;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCadastrarLivro extends JInternalFrame {
	private JTextField txtAa;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblEditora;
	private JLabel lblDataDaPublicao;
	private JLabel lblNmeroDeExemplares;
	private JLabel lblTtulo;
	private JLabel lblCdigoIsbn;
	private JButton btnNewButton_1;

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
		
		txtAa = new JTextField();
		txtAa.setToolTipText("Nome do Livro");
		txtAa.setBounds(134, 194, 468, 51);
		getContentPane().add(txtAa);
		txtAa.setColumns(10);
		
		textField = new JTextField();
		textField.setToolTipText("Nome do Livro");
		textField.setColumns(10);
		textField.setBounds(134, 339, 468, 51);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Nome do Livro");
		textField_1.setColumns(10);
		textField_1.setBounds(134, 489, 468, 51);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Nome do Livro");
		textField_2.setColumns(10);
		textField_2.setBounds(134, 638, 468, 51);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("Nome do Livro");
		textField_3.setColumns(10);
		textField_3.setBounds(969, 204, 468, 51);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("Nome do Livro");
		textField_4.setColumns(10);
		textField_4.setBounds(969, 339, 468, 51);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel = new JLabel("Autor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(144, 105, 208, 79);
		getContentPane().add(lblNewLabel);
		
		lblEditora = new JLabel("Editora");
		lblEditora.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblEditora.setBounds(144, 250, 208, 79);
		getContentPane().add(lblEditora);
		
		lblDataDaPublicao = new JLabel("Data da Publicação");
		lblDataDaPublicao.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblDataDaPublicao.setBounds(144, 400, 413, 79);
		getContentPane().add(lblDataDaPublicao);
		
		lblNmeroDeExemplares = new JLabel("Número de Exemplares");
		lblNmeroDeExemplares.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNmeroDeExemplares.setBounds(144, 550, 447, 79);
		getContentPane().add(lblNmeroDeExemplares);
		
		lblTtulo = new JLabel("Título");
		lblTtulo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblTtulo.setBounds(983, 115, 208, 79);
		getContentPane().add(lblTtulo);
		
		lblCdigoIsbn = new JLabel("Código ISBN");
		lblCdigoIsbn.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblCdigoIsbn.setBounds(979, 265, 314, 79);
		getContentPane().add(lblCdigoIsbn);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewModalConfirmacao modalConfirmacao = new ViewModalConfirmacao();

				modalConfirmacao.setVisible(true);
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(156, 102, 68));
		btnNewButton.setBounds(231, 751, 284, 44);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(134, 66, 85, 21);
		getContentPane().add(btnNewButton_1);

	}
}
