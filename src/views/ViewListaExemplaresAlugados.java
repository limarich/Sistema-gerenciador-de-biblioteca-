package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JInternalFrame;

import models.Livro;

public class ViewListaExemplaresAlugados extends JInternalFrame {
	
    private List<Livro> livrosAlugados; // supondo que essa lista já foi inicializada em algum lugar
    private JButton btnNewButton;

	public static void main(String[] args, String cpf) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewListaExemplaresAlugados frame = new ViewListaExemplaresAlugados(cpf);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    public ViewListaExemplaresAlugados(String cpf) {
    	// Fazer função que busca o livros alugados de acordo com o cpf
        int y = 100; // posição y inicial dos botões

        // Cria um botão "devolver" para cada livro alugado
        for (Livro livro : livrosAlugados) {
            JButton btnDevolver = new JButton("Devolver"); // cria botão com nome do livro:  "Devolver " + livro.getTitulo()
            btnDevolver.setForeground(Color.WHITE);
            btnDevolver.setFont(new Font("Tahoma", Font.PLAIN, 25));
            btnDevolver.setBackground(new Color(156, 102, 68));
            btnDevolver.setBounds(570, y, 284, 44);
    		
   
            btnDevolver.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    ViewModalConfirmacao modalConfirmacao = new ViewModalConfirmacao();
                    modalConfirmacao.setVisible(true);
                    // TODO: atualizar status do exemplar em questão para "disponivel"
                }

            });
            getContentPane().add(btnDevolver);
            y += 50;
        }

		btnNewButton = new JButton("Voltar1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(26, 36, 85, 21);
		getContentPane().add(btnNewButton);
    }
}
