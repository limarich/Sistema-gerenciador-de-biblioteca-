package controllers;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;

import models.Exemplar;
import models.Livro;

public class AlugarLivroController extends Livro 
{
	private Livro livro = new Livro();
	private Exemplar exemplar = new Exemplar();
	private Exemplar listExemplares[];
	
	// exemplar, cpf
	public void pegarDados(
							String exemplar, 
							String cpf
						 ) 
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		
		this.livro.setAutor(exemplar);
		this.listExemplares[0].setCpf(cpf);
		this.listExemplares[0].setStatus("alugado");
		this.listExemplares[0].setDt_inicio(dateFormat.format(date));
		this.listExemplares[0].setDt_fim(dateFormat.format(date));
		
		
		
		
	}
}