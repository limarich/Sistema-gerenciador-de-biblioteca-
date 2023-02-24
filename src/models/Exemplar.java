package models;

public class Exemplar {
	
	private int id;
	private int id_livro;
	private int cpf;
	private String status;
	private String dt_inicio;
	private String dt_fim;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId_livro() {
		return id_livro;
	}
	
	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getDt_inicio() {
		return dt_inicio;
	}
	
	public void setDt_inicio(String dt_inicio) {
		this.dt_inicio = dt_inicio;
	}
	
	public String getDt_fim() {
		return dt_fim;
	}
	
	public void setDt_fim(String dt_fim) {
		this.dt_fim = dt_fim;
	}
	
}
