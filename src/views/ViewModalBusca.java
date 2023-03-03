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

public class ViewModalBusca extends JInternalFrame 
{
	// Parâmetros: String título, ViewHomepage home, int numero_da_view

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField textField;
	private static ViewModalBusca frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String title, ViewHomepage home, int num) {
		try {
			frame = new ViewModalBusca(title, home, num);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Create the dialog.
	 */
	public ViewModalBusca(String title, ViewHomepage home, int num) {
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
			}
			textField.setBounds(frameX+30, frameY+100, 360, 40);
			textField.setColumns(10);
			contentPanel.add(textField);
		}
		{
			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					home.openView(num, textField.getText());
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
