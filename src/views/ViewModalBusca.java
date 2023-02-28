package views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.Console;
import java.awt.event.ActionEvent;

public class ViewModalBusca extends JDialog {
	
	// Parâmetros: String título, String nome_do_tipo_da_pesquisa

	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, String title) {
		try {
			ViewModalBusca dialog = new ViewModalBusca(title);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the dialog.
	 */
	public ViewModalBusca(String title) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
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
		contentPanel.setBackground(new Color(156, 102, 68));
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
			textField.setBounds(frameX+30, frameY+100, 360, 40);
			textField.setColumns(10);
			contentPanel.add(textField);
		}
		{
			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOk.setBounds(frameX+410, frameY+100, 40, 40);
			btnOk.setFont(new Font("Tahoma", Font.PLAIN, 6));
			contentPanel.add(btnOk);
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 190, 156));
		panel.setBounds(frameX, frameY, 480, 240);
		contentPanel.add(panel);
	}

}
