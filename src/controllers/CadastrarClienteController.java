package controllers;

import java.util.Random;

import models.Usuario;

public class CadastrarClienteController extends Usuario 
{
	Usuario usuario = new Usuario();
	Random random = new Random();
	
	// cpf, nome, dataNascimento, telefone, email, cep, uf, cidade, bairro, rua, numero
	public void pegarDados(
							String cpf, 
							String nome, 
							String dataNascimento, 
							String telefone, 
							String email, 
							String cep, 
							String uf, 
							String cidade,
							String bairro,
							String rua,
							String numero
						 ) 
	{
		this.usuario.setCpf(cpf);
		this.usuario.setNome(nome);
		this.usuario.setDataNascimento(dataNascimento);
		this.usuario.setTelefone(telefone);
		this.usuario.setEmail(email);
		this.usuario.setCep(cep);
		this.usuario.setUf(uf);
		this.usuario.setCidade(cidade);
		this.usuario.setBairro(bairro);
		this.usuario.setRua(rua);
		this.usuario.setNumero(Integer.parseInt(numero));
		this.usuario.setSenha(null);
		
	}
}
