package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controllers.ConnectionDB;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ViewHomepage 
{
	public static ViewHomepage window;
	private JFrame frame;
	private JDesktopPane desktopPane;
	public int flag;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new ViewHomepage();
					window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void openView(int num, String cpf) {
		if(num == 1) {
			ViewEditarCliente viewEditarCliente = new ViewEditarCliente();
			desktopPane.add(viewEditarCliente);
			viewEditarCliente.setVisible(true);			
		} else if(num == 2) {
			ViewDevolverLivro viewDevolverLivro = new ViewDevolverLivro( cpf );
			desktopPane.add(viewDevolverLivro);
			viewDevolverLivro.setVisible(true);
		} else if(num == 3) {
			ViewAlugarLivro viewAlugarLivro = new ViewAlugarLivro();
			desktopPane.add(viewAlugarLivro);
			viewAlugarLivro.setVisible(true);
		} else if(num == 4) {
			ViewEditarLivro viewEditarLivro = new ViewEditarLivro();
			desktopPane.add(viewEditarLivro);
			viewEditarLivro.setVisible(true);
		}
	}
	
	/**
	 * Create the application.
	 */
	public ViewHomepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(221, 161, 94));
		frame.getContentPane().setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(221, 161, 94));
		desktopPane.setBounds(0, 0, 450, 270);
		frame.getContentPane().add(desktopPane);
		desktopPane.setBounds(0, 0, screenSize.width, screenSize.height);
		desktopPane.setLayout(null);
		
		JButton btnCadastrarCliente = new JButton("CADASTRAR CLIENTE");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadastrarCliente viewCadastrarCliente= new ViewCadastrarCliente();
				desktopPane.add(viewCadastrarCliente);
				viewCadastrarCliente.setVisible(true);
				
			}
		});
		btnCadastrarCliente.setBackground(new Color(217, 217, 217));
		btnCadastrarCliente.setBounds(778, 262, 136, 45);
		desktopPane.add(btnCadastrarCliente);
		
		JButton btnDevolverLivro = new JButton("DEVOLVER LIVRO");
		btnDevolverLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewModalBusca viewModalBusca = new ViewModalBusca("Devolução de livro", window, 2, "Digite o cpf do usuário");
				desktopPane.add(viewModalBusca);
				viewModalBusca.setVisible(true);
				
			}
		});
		btnDevolverLivro.setBackground(new Color(217, 217, 217));
		btnDevolverLivro.setBounds(334, 392, 136, 45);
		desktopPane.add(btnDevolverLivro);
		
		JButton btnEditarCliente = new JButton("EDITAR CLIENTE");
		btnEditarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewModalBusca viewModalBusca = new ViewModalBusca("Editar cadastro de clientes", window, 1, "Digite o cpf do usuário");
				desktopPane.add(viewModalBusca);
				viewModalBusca.setVisible(true);
			}
		});
		btnEditarCliente.setBackground(new Color(217, 217, 217));
		btnEditarCliente.setBounds(334, 262, 136, 45);
		desktopPane.add(btnEditarCliente);
		
		JButton btnCadastrarLivro = new JButton("CADASTRAR LIVRO");
		btnCadastrarLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCadastrarLivro viewCadastrarLivro = new ViewCadastrarLivro();
				desktopPane.add(viewCadastrarLivro);
				viewCadastrarLivro.setVisible(true);
			}
		});
		btnCadastrarLivro.setBackground(new Color(217, 217, 217));
		btnCadastrarLivro.setBounds(334, 151, 136, 45);
		desktopPane.add(btnCadastrarLivro);
		
		JButton btnAlugarLivro = new JButton("ALUGAR LIVRO");
		btnAlugarLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewModalBusca viewModalBusca = new ViewModalBusca("Busca de exemplares disponíveis", window, 3, "Digite o título do livro");
				desktopPane.add(viewModalBusca);
				viewModalBusca.setVisible(true);
			}
		});
		btnAlugarLivro.setBackground(new Color(217, 217, 217));
		btnAlugarLivro.setBounds(778, 151, 136, 45);
		desktopPane.add(btnAlugarLivro);
		
		JButton btnEditarLivro = new JButton("EDITAR LIVRO");
		btnEditarLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewModalBusca viewModalBusca = new ViewModalBusca("Editar cadastro de livros", window, 4, "Digite o título do livro");
				desktopPane.add(viewModalBusca);
				viewModalBusca.setVisible(true);
			}
		});
		btnEditarLivro.setBackground(new Color(217, 217, 217));
		btnEditarLivro.setBounds(778, 392, 136, 45);
		desktopPane.add(btnEditarLivro);

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
