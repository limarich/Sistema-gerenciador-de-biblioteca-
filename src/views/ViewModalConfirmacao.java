package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewModalConfirmacao extends JDialog 
{

	private final JPanel contentPanel = new JPanel();
	public ViewCadastrarCliente cadastrarCliente;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ViewModalConfirmacao dialog = new ViewModalConfirmacao();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ViewModalConfirmacao() {
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
			JLabel lblNewLabel = new JLabel("Tem Certeza?");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(134, 34, 170, 64);
			contentPanel.add(lblNewLabel);
		}
		{
			JButton btnSi = new JButton("Sim");
			btnSi.setForeground(Color.WHITE);
			btnSi.setBackground(new Color(96, 108, 58));
			btnSi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnSi.setBounds(101, 189, 85, 21);
			contentPanel.add(btnSi);
		}
		{
			JButton btnNo = new JButton("Não");
			btnNo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNo.setBounds(259, 189, 85, 21);
			contentPanel.add(btnNo);
		}
	}

}
