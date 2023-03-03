package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewModalErro extends JDialog 
{

	private final JPanel contentPanel = new JPanel();
	public ViewCadastrarCliente cadastrarCliente;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String titulo) {
		try {
			ViewModalErro dialog = new ViewModalErro(titulo);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ViewModalErro(String titulo) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// obtém a largura e altura da tela
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;

		// define a largura e altura da janela
		int frameWidth = 450;
		int frameHeight = 300;

		// calcula a posição x e y da janela para centralizá-la na tela
		int frameX = (screenWidth - frameWidth) / 2;
		int frameY = (screenHeight - frameHeight) / 2;

		// define a posição e dimensão da janela
		setBounds(frameX, frameY, frameWidth, frameHeight);
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(156, 102, 68));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel(titulo, JLabel.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(0, 60, 434, 64);
			contentPanel.add(lblNewLabel);
		}
		{
			JButton btnOk = new JButton("OK");
			btnOk.setForeground(Color.WHITE);
			btnOk.setBackground(new Color(96, 108, 58));
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOk.setBounds(170, 160, 100, 50);
			contentPanel.add(btnOk);
		}
	}

}
