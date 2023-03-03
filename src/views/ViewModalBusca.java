package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controllers.ConnectionDB;
import controllers.EditarClienteController;
import controllers.MeuDocumento;
import models.Usuario;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Dimension;
import java.awt.Toolkit;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class ViewModalBusca extends JInternalFrame 
{
	// Parâmetros: String título, ViewHomepage home, int numero_da_view

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblPlaceholder;
	private JTextField textField;
	private static ViewModalBusca frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String title, ViewHomepage home, int num, String placeholder) {
		try {
			frame = new ViewModalBusca(title, home, num, placeholder);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void fetchUsuario() {
		EditarClienteController editar = new EditarClienteController();
		editar.checar(this.textField.getText(), frame);
	}
	
	/**
	 * Create the dialog.
	 */
	public ViewModalBusca(String title, ViewHomepage home, int num, String placeholder) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setMaximizable(true);
		setResizable(true);
		getContentPane().setBackground(new Color(221, 161, 94));
		setClosable(true);
		setBounds(0, 0, screenSize.width, screenSize.height);
		getContentPane().setLayout(null);
		
		// define a largura e altura do componente interno
		int frameWidth = 450;
		int frameHeight = 300;
		
		// obtém a largura e altura da tela
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		// calcula a posição x e y do componente interno para centralizá-lo na tela
		int frameX = (screenWidth - frameWidth) / 2;
		int frameY = (screenHeight - frameHeight) / 2;

		// define a posição e dimensão da janela
		setBounds(0, 0, screenWidth, screenHeight);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(221, 161, 94));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		{
			lblNewLabel = new JLabel(title);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBounds(frameX+30, frameY+20, 350, 64);
			contentPanel.add(lblNewLabel);
		}
		{
			textField = new JTextField();
			if(num == 1 || num == 2) {
				textField.addKeyListener(new KeyListener() {
	                public void keyTyped(KeyEvent e) {
	                    if (!((e.getKeyChar() >= KeyEvent.VK_0 && 
	                           e.getKeyChar() <= KeyEvent.VK_9) || 
	                          (e.getKeyChar() == KeyEvent.VK_ENTER || 
	                           e.getKeyChar() == KeyEvent.VK_SPACE || 
	                           e.getKeyChar() == KeyEvent.VK_BACK_SPACE))) {
	                        e.consume();
	                    }
	                }
	
	                public void keyPressed(KeyEvent e) {
	                }
	
	                public void keyReleased(KeyEvent e) {
	                }
	            });
			    textField.setDocument(new MeuDocumento(11));  
			}
			textField.setBounds(frameX+30, frameY+100, 360, 40);
			textField.setColumns(10);
			contentPanel.add(textField);
		}
		{
			lblPlaceholder = new JLabel(placeholder);
			lblPlaceholder.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblPlaceholder.setForeground(Color.BLACK);
			lblPlaceholder.setBounds(frameX+30, frameY+120, 350, 64);
			contentPanel.add(lblPlaceholder);
		}
		{
			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ConnectionDB con = new ConnectionDB();
					String sql = "SELECT * FROM usuario where pk_cpf='"+textField.getText()+"';";
					ResultSet res = con.executaBusca(sql);
					
					
					try {
						while(res.next()) {
							
							Usuario usuario = new Usuario();
							usuario.setNome(res.getString("nome_usuario"));
							usuario.setEmail(res.getString("email_usuario"));
							usuario.setTelefone(res.getString("telefone_usuario"));
							usuario.setDataNascimento(res.getDate("data_nascimento"));
							usuario.setRua(res.getString("rua"));
							usuario.setBairro(res.getString("bairro"));
							usuario.setUf(res.getString("cep"));
							usuario.setNumero(Integer.parseInt(res.getString("numero")));
							usuario.setCep(Integer.parseInt(res.getString("cep")));
							
							EditarClienteController editar = new EditarClienteController();
							editar.checar(usuario, frame);
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
						ViewModalErro erro = new ViewModalErro("CPF não cadastrado");
						erro.setVisible(true);
					}
					
					//home.openView(num, textField.getText());
				}
			});
			btnOk.setBounds(frameX+410, frameY+100, 40, 40);
			btnOk.setFont(new Font("Tahoma", Font.PLAIN, 4));
			contentPanel.add(btnOk);
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 190, 156));
		panel.setBounds(frameX, frameY, 480, 240);
		contentPanel.add(panel);
		
	}

}
