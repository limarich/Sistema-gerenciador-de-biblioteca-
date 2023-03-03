package controllers;

import java.util.Random;

import models.Exemplar;
import models.Livro;

public class CadastrarLivroController extends Livro 
{
	Random random = new Random();
	Livro livro = new Livro();
	Exemplar exemplar = new Exemplar();
	private int aleatorio;
	private int turnInt;
	
	// codigo, autor, editora, dataPublicacao, titulo
	public void pegarDados(
							String codigo, 
							String autor, 
							String editora, 
							String dataPubli, 
							String titulo,
							String numExemp
						 ) 
	{
		
		this.livro.setCodigo(Integer.parseInt(codigo));
		this.livro.setAutor(autor);
		this.livro.setEditora(editora);
		this.livro.setDataPublicacao(dataPubli);
		this.livro.setTitulo(titulo);
		
		turnInt = Integer.parseInt(numExemp);
		
		for(int i = 0; i<turnInt; i++) {
			this.exemplar.setId_livro(Integer.parseInt(codigo));
			this.exemplar.setStatus("disponivel");
			aleatorio = random.nextInt(99999);
			// cadastrar cada objeto no banco
		}
		
		
	}
}