package models;

public class Livro {
	
	private int codigo;
	private int id_autor;
	private int id_editora;
	private int id_genero;
	private String titulo;
	private String dataPublicacao;
	
	public int getId_autor() {
		return id_autor;
	}
	
	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}
	
	public int getId_editora() {
		return id_editora;
	}

	public void setId_editora(int id_editora) {
		this.id_editora = id_editora;
	}
	
	public int getId_genero() {
		return id_genero;
	}

	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}

	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
}
