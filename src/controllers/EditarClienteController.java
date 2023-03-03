package controllers;

import java.sql.Date;

import models.Usuario;
import views.ViewEditarCliente;
import views.ViewModalBusca;

public class EditarClienteController extends Usuario 
{
	Usuario usuario = new Usuario();
	
	public void checar(String cpf, ViewModalBusca frame) {
		//
		//se der ruim
		frame.invalido();
		
		//se der bom
		frame.valido(usuario);
	}
	
	// cpf, nome, dataNascimento, telefone, email, cep, uf, cidade, bairro, rua, numero
	public void pegarDados(
							String cpf, 
							String nome, 
							Date string, 
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
		this.usuario.setDataNascimento(string);
		this.usuario.setTelefone(telefone);
		this.usuario.setEmail(email);
		this.usuario.setCep(Integer.parseInt(cep));
		this.usuario.setUf(uf);
		this.usuario.setCidade(cidade);
		this.usuario.setBairro(bairro);
		this.usuario.setRua(rua);
		this.usuario.setNumero(Integer.parseInt(numero));
		
	}

	public void pegarDados(String text, String text2, String text3, String text4, String text5, String text6,
			String text7, String text8, String text9, String text10, String text11) {
		// TODO Auto-generated method stub
		
	}
}
