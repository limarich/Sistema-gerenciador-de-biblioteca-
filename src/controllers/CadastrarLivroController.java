package controllers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import models.Exemplar;
import models.Livro;

public class CadastrarLivroController extends Livro 
{
	Random random = new Random();
	Livro livro = new Livro();
	Exemplar exemplar = new Exemplar();
	private int turnInt;
	
	// codigo, autor, editora, dataPublicacao, titulo
	public void pegarDados(
    String codigo, 
    String autor, 
    String editora, 
    String dataPubli, 
    String titulo,
    String numExemp
) {
    this.livro.setCodigo(Integer.parseInt(codigo));
    this.livro.setAutor(autor);
    this.livro.setEditora(editora);
    this.livro.setTitulo(titulo);
    
    turnInt = Integer.parseInt(numExemp);
    
    LocalDate localDate = LocalDate.parse(dataPubli, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    java.sql.Date data = java.sql.Date.valueOf(localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    
    this.livro.setDataPublicacao(data);
    
    ConnectionDB con = new ConnectionDB();
    String sqlSearch = "SELECT * FROM livro where pk_livro= " + this.livro.getCodigo()+";";
    String sqlInsert = "INSERT INTO public.livro( pk_livro, titulo, edicao, data_publicacao, autor, editora) VALUES (?, ?, ?, ?, ?, ?);";
    String sqlExemplar = "INSERT INTO public.exemplar(pk_exemplar, fk_cpf_usuario, fk_livro, status, data_inicio_emprestimo, data_fim_emprestimo) VALUES (?, ?, ?, ?, ?, ?);";
    PreparedStatement ps;
    
    ResultSet resSearch = con.executaBusca(sqlSearch);
    int fk_livro = 0;
    try {
    	while(resSearch.next()) {
    		fk_livro = resSearch.getInt("fk_livro");
    	}
    } catch(Exception e) {
    	try {
    		fk_livro = this.livro.getCodigo();
            ps = con.getConnection().prepareStatement(sqlInsert);
            ps.setInt(1,  this.livro.getCodigo());
            ps.setString(2, "aaa");
            ps.setString(3, "---");
            ps.setDate(4,  this.livro.getDataPublicacao());
            ps.setString(5,  this.livro.getAutor());
            ps.setString(6,  this.livro.getEditora());
            
            int res = ps.executeUpdate();
            
            if(res > 0) {
                System.out.println("criou livro ");
            } else {
                System.out.println("não criou livro");
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
    
    for(int i = 0; i<turnInt; i++) {
    	try {
    		PreparedStatement ps1 = con.getConnection().prepareStatement(sqlExemplar);
			ps1.setInt(1,  random.nextInt(99999));
			ps1.setString(2, null);
			ps1.setInt(3, fk_livro);
			ps1.setString(4,  "disponivel");
			ps1.setDate(5,  this.livro.getDataPublicacao());
			ps1.setDate(6,  this.livro.getDataPublicacao());
			int res1 = ps1.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    con.closeConnection();
}
}

