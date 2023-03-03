package controllers;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import models.Usuario;

public class CadastrarClienteController extends Usuario {
    
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
    ) throws SQLException {
        setCpf(cpf);
        setNome(nome);
        
        LocalDate localDate = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        java.sql.Date data = java.sql.Date.valueOf(localDate);
        
        setDataNascimento(data);
        setTelefone(telefone);
        setEmail(email);
        setCep(Integer.parseInt(cep));
        setUf(uf);
        setCidade(cidade);
        setBairro(bairro);
        setRua(rua);
        setNumero(Integer.parseInt(numero));
        
        ConnectionDB con = new ConnectionDB();
        String sql = "INSERT INTO public.usuario(pk_cpf, nome_usuario, data_nascimento, telefone_usuario, email_usuario, senha, cep, uf, cidade, bairro, rua, numero) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.getConnection().prepareStatement(sql);
        ps.setString(1, getCpf());
        ps.setString(2, getNome());
        ps.setDate(3, getDataNascimento());
        ps.setString(4, getTelefone());
        ps.setString(5, getEmail());
        ps.setString(6, "123456");
        ps.setInt(7, getCep());
        ps.setString(8, getUf());
        ps.setString(9, getCidade());
        ps.setString(10, getBairro());
        ps.setString(11, getRua());
        ps.setInt(12, getNumero());
        
        int res = ps.executeUpdate();
        
        if(res > 0) {
            System.out.println("criou");
        } else {
            System.out.println("não criou");
        }
        
        con.closeConnection();
    }

}
