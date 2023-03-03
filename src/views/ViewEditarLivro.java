package views;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import controllers.CadastrarLivroController;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class ViewEditarLivro extends JInternalFrame 
{
	private JTextField textFieldAutor;
	private JTextField textFieldEditora;
	private JTextField textFieldDataDaPublicacao;
	private JTextField textFieldNumeroDeExemplares;
	private JTextField textFieldTitulo;
	private JTextField textFieldCodigo;
	private JLabel lblAutor;
	private JLabel lblEditora;
	private JLabel lblDataDaPublicacao;
	private JLabel lblNumeroDeExemplares;
	private JLabel lblTitulo;
	private JLabel lblCodigoIsbn;
	private JButton btnNewButton_1;
	private static ViewEditarLivro frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewEditarLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void enviarDados() {
		CadastrarLivroController cadastro = new CadastrarLivroController();
		cadastro.pegarDados(
			this.textFieldCodigo.getText(),
			this.textFieldAutor.getText(),
			this.textFieldEditora.getText(),
			this.textFieldDataDaPublicacao.getText(),
			this.textFieldTitulo.getText(),
			this.textFieldNumeroDeExemplares.getText()
		);
	}

	/**
	 * Create the frame.
	 */
	public ViewEditarLivro() {
		getContentPane().setBackground(new Color(221, 161, 94));
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setClosable(true);
		setBounds(0, 0, screenSize.width, screenSize.height);
		getContentPane().setLayout(null);
		
		textFieldAutor = new JTextField();
		textFieldAutor.setBounds(160, 170, 400, 40);
		getContentPane().add(textFieldAutor);
		textFieldAutor.setColumns(10);
		
		textFieldEditora = new JTextField();
		textFieldEditora.setColumns(10);
		textFieldEditora.setBounds(160, 290, 400, 40);
		getContentPane().add(textFieldEditora);
		
		textFieldDataDaPublicacao = new JTextField();
		textFieldDataDaPublicacao.setColumns(10);
		textFieldDataDaPublicacao.setBounds(160, 410, 400, 40);
		getContentPane().add(textFieldDataDaPublicacao);
		
		textFieldNumeroDeExemplares = new JTextField();
		textFieldNumeroDeExemplares.setColumns(10);
		textFieldNumeroDeExemplares.setBounds(160, 530, 400, 40);
		getContentPane().add(textFieldNumeroDeExemplares);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setColumns(10);
		textFieldTitulo.setBounds(790, 170, 400, 40);
		getContentPane().add(textFieldTitulo);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setColumns(10);
		textFieldCodigo.setBounds(790, 290, 400, 40);
		getContentPane().add(textFieldCodigo);
		
		lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAutor.setBounds(160, 120, 208, 40);
		getContentPane().add(lblAutor);
		
		lblEditora = new JLabel("Editora");
		lblEditora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEditora.setBounds(160, 240, 208, 40);
		getContentPane().add(lblEditora);
		
		lblDataDaPublicacao = new JLabel("Data da Publicação");
		lblDataDaPublicacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataDaPublicacao.setBounds(160, 360, 208, 20);
		getContentPane().add(lblDataDaPublicacao);
		
		lblNumeroDeExemplares = new JLabel("Número de Exemplares");
		lblNumeroDeExemplares.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumeroDeExemplares.setBounds(160, 480, 208, 20);
		getContentPane().add(lblNumeroDeExemplares);
		
		lblTitulo = new JLabel("Título");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTitulo.setBounds(790, 120, 208, 40);
		getContentPane().add(lblTitulo);
		
		lblCodigoIsbn = new JLabel("Código ISBN");
		lblCodigoIsbn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigoIsbn.setBounds(790, 240, 208, 40);
		getContentPane().add(lblCodigoIsbn);
		
		JButton btnNewButton = new JButton("Atualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewModalConfirmacao modalConfirmacao = new ViewModalConfirmacao();
                modalConfirmacao.setVisible(true);
                enviarDados();
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(156, 102, 68));
		btnNewButton.setBounds(230, 650, 260, 40);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(134, 66, 85, 21);
		getContentPane().add(btnNewButton_1);
		
		ImageIcon imagem = new ImageIcon(getClass().getResource("livro.png"));
		JLabel label = new JLabel(imagem);
		label.setBounds(790, 341, 407, 349);
		getContentPane().add(label);
		
		
	}
}
