package controllers;

import java.util.Random;

import models.Livro;

public class EditarLivroController extends Livro 
{
	Livro livro = new Livro();
	
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
		//pesquisa livro utilizando seu codigo
		this.livro.setAutor(autor);
		this.livro.setEditora(editora);
		this.livro.setDataPublicacao(dataPubli);
		this.livro.setTitulo(titulo);	
	}
}