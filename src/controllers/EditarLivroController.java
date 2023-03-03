package controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
		  LocalDate localDate = LocalDate.parse(dataPubli, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		    java.sql.Date data = java.sql.Date.valueOf(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		    
		    this.livro.setDataPublicacao(data);
		this.livro.setTitulo(titulo);	
	}
}