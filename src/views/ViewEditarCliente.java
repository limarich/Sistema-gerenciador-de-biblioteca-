package views;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import controllers.EditarClienteController;
import models.Usuario;

public class ViewEditarCliente extends JInternalFrame 
{
	private JTextField textFieldNome;
	private JTextField textFieldEmail;
	private JTextField textFieldDataNas;
	private JTextField textFieldCpf;
	private JTextField textFieldTelefone;
	private JTextField textFieldRua;
	private JTextField textFieldBairro;
	private JTextField textFieldCidade;
	private JTextField textFieldUf;
	private JTextField textFieldCep;
	private JTextField textFieldN;
	private JLabel lblNome;
	private JLabel lblEmail;
	private JLabel lblDataNas;
	private JLabel lblCpf;
	private JLabel lblTelefone;
	private JLabel lblRua;
	private JLabel lblBairro;
	private JLabel lblCidade;
	private JLabel lblUf;
	private JLabel lblCep;
	private JLabel lblN;
	private JButton btnNewButton_1;
	private ViewEditarCliente frame;
	
	
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
	
	public boolean pegarFlag(boolean tome) {
		return tome;
	}
	
	
	
	
	public void enviarDados() {
		EditarClienteController editar = new EditarClienteController();
		editar.pegarDados(
			this.textFieldCpf.getText(),
			this.textFieldNome.getText(),
			this.textFieldDataNas.getText(),
			this.textFieldTelefone.getText(),
			this.textFieldEmail.getText(),
			this.textFieldCep.getText(),
			this.textFieldUf.getText(),
			this.textFieldCidade.getText(),
			this.textFieldBairro.getText(),
			this.textFieldRua.getText(),
			this.textFieldN.getText()
		);
	}
	
	/**
	 * Create the frame.
	 */
	public ViewEditarCliente() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// obtém a largura e altura da tela
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;

		// define a largura e altura da janela
		int frameWidth = 450;
		int frameHeight = 300;

		// calcula a posição x e y da janela para centralizá-la na tela
		int frameX = (screenWidth - frameWidth) / 2;
		
		setMaximizable(true);
		setResizable(true);
		getContentPane().setBackground(new Color(221, 161, 94));
		setClosable(true);
		setBounds(0, 0, screenSize.width, screenSize.height);
		getContentPane().setLayout(null);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(160, 170, 400, 40);
		getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(160, 290, 400, 40);
		getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(20);
		
		textFieldDataNas = new JTextField();
		textFieldDataNas.setBounds(160, 410, 190, 40);
		getContentPane().add(textFieldDataNas);
		textFieldDataNas.setColumns(10);
		
		textFieldCpf = new JTextField();
		textFieldCpf.setBounds(370, 410, 190, 40);
		getContentPane().add(textFieldCpf);
		textFieldCpf.setColumns(10);

		textFieldTelefone = new JTextField();
		textFieldTelefone.setBounds(160, 530, 190, 40);
		getContentPane().add(textFieldTelefone);
		textFieldTelefone.setColumns(10);
		
		textFieldRua = new JTextField();
		textFieldRua.setBounds(790, 170, 400, 40);
		getContentPane().add(textFieldRua);
		textFieldRua.setColumns(10);
		
		textFieldBairro = new JTextField();
		textFieldBairro.setBounds(790, 290, 400, 40);
		getContentPane().add(textFieldBairro);
		textFieldBairro.setColumns(10);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setBounds(790, 410, 320, 40);
		getContentPane().add(textFieldCidade);
		textFieldCidade.setColumns(10);
		
		textFieldUf = new JTextField();
		textFieldUf.setBounds(1150, 410, 40, 40);
		getContentPane().add(textFieldUf);
		textFieldUf.setColumns(10);
		
		textFieldCep = new JTextField();
		textFieldCep.setBounds(790, 530, 320, 40);
		getContentPane().add(textFieldCep);
		textFieldCep.setColumns(10);
		
		textFieldN = new JTextField();
		textFieldN.setBounds(1150, 530, 40, 40);
		getContentPane().add(textFieldN);
		textFieldN.setColumns(10);
		
		
		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(160, 120, 208, 40);
		getContentPane().add(lblNome);

		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(160, 240, 208, 40);
		getContentPane().add(lblEmail);

		lblDataNas = new JLabel("Data de Nascimento");
		lblDataNas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataNas.setBounds(160, 360, 208, 40);
		getContentPane().add(lblDataNas);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCpf.setBounds(370, 360, 208, 40);
		getContentPane().add(lblCpf);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefone.setBounds(160, 480, 208, 40);
		getContentPane().add(lblTelefone);
		
		lblRua = new JLabel("Rua");
		lblRua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRua.setBounds(790, 120, 208, 40);
		getContentPane().add(lblRua);
		
		lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBairro.setBounds(790, 240, 208, 40);
		getContentPane().add(lblBairro);
		
		lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCidade.setBounds(790, 360, 208, 40);
		getContentPane().add(lblCidade);
		
		lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUf.setBounds(1150, 360, 208, 40);
		getContentPane().add(lblUf);
		
		lblCep = new JLabel("Cep");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCep.setBounds(790, 480, 208, 40);
		getContentPane().add(lblCep);
		
		lblN = new JLabel("N");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblN.setBounds(1150, 480, 208, 40);
		getContentPane().add(lblN);
		
		JButton btnNewButton = new JButton("Atualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(textFieldCpf.getText().length() == 11){
                	ViewModalConfirmacao modalConfirmacao = new ViewModalConfirmacao();
                    modalConfirmacao.setVisible(true);
                	enviarDados();
                }
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(156, 102, 68));
		btnNewButton.setBounds(545, 650, 260, 40);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(textFieldNome.getText());
				dispose();
			}
		});
		btnNewButton_1.setBounds(134, 66, 85, 21);
		getContentPane().add(btnNewButton_1);
		
		ImageIcon imag = new ImageIcon(getClass().getResource("alexandre.png"));
		JLabel la = new JLabel(imag);
		la.setBounds(frameX+136, 20, 136, 103);
		getContentPane().add(la);

	}
}
