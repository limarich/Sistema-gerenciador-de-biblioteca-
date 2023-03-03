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

import controllers.AlugarLivroController;
import controllers.MeuDocumento;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ViewAlugarLivro extends JInternalFrame 
{
	// Parâmetros: String título, ViewHomepage home, int numero_da_view

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblPlaceholder;
	private JTextField textFieldExemplar;
	private JTextField textFieldCpf;
	private static ViewAlugarLivro frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frame = new ViewAlugarLivro();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enviarDados() {
		AlugarLivroController alugar = new AlugarLivroController();
		alugar.pegarDados(
			this.textFieldExemplar.getText(),
			this.textFieldCpf.getText()
		);
	}
	
	/**
	 * Create the dialog.
	 */
	public ViewAlugarLivro() {
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
			lblNewLabel_1 = new JLabel("Busca de exemplares disponíveis", JLabel.CENTER);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(frameX, frameY-75, 480, 64);
			lblNewLabel_1.setForeground(Color.BLACK);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textFieldExemplar = new JTextField();
			textFieldExemplar.setBounds(frameX+30, frameY-15, 360, 40);
			textFieldExemplar.setColumns(10);
			contentPanel.add(textFieldExemplar);
		}
		{
			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOk.setBounds(frameX+410, frameY-15, 40, 40);
			btnOk.setFont(new Font("Tahoma", Font.PLAIN, 4));
			contentPanel.add(btnOk);
		}

		
		{
			lblNewLabel = new JLabel("Exemplares disponíveis para aluguel: ", JLabel.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBounds(frameX, frameY+30, 480, 64);
			contentPanel.add(lblNewLabel);
		}
		{
			textFieldCpf = new JTextField();
			textFieldCpf.addKeyListener(new KeyListener() {
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
			textFieldCpf.setDocument(new MeuDocumento(11));  
			textFieldCpf.setBounds(frameX+30, frameY+100, 360, 40);
			textFieldCpf.setColumns(10);
			contentPanel.add(textFieldCpf);
		}
		{
			lblPlaceholder = new JLabel("Digite o cpf do usuário");
			lblPlaceholder.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblPlaceholder.setForeground(Color.BLACK);
			lblPlaceholder.setBounds(frameX+30, frameY+120, 350, 64);
			contentPanel.add(lblPlaceholder);
		}
		{
			JButton btnAlugar = new JButton("Alugar");
			btnAlugar.setForeground(Color.WHITE);
			btnAlugar.setBackground(new Color(96, 108, 58));
			btnAlugar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(textFieldCpf.getText().length() == 11) {
						ViewModalConfirmacao modalConfirmacao = new ViewModalConfirmacao();
	                    modalConfirmacao.setVisible(true);
						enviarDados();
					} else {
						ViewModalErro erro = new ViewModalErro("CPF Inválido");
						erro.setVisible(true);
					}
					
				}
			});
			btnAlugar.setBounds(frameX+150, frameY+200, 180, 40);
			contentPanel.add(btnAlugar);
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 190, 156));
		panel.setBounds(frameX, frameY-100, 480, 390);
		contentPanel.add(panel);
		
	}

}
