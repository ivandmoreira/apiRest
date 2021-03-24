package br.com.loja.apis.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.loja.DTO.UsuarioDTO;
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy	=	GenerationType.IDENTITY)
	private long	id;								
	private	String	nome;								
	private	String	cpf;								
	private	String	endereco;
	private	String	email;
	private	String	telefone;
	private	Date	dataCadastro;
	
	
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public Date getDataCadastro() {
		return dataCadastro;
	}



	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}



	public	static	Usuario	convert(UsuarioDTO	usuarioDTO) {
	
		Usuario	Usuario	=	new	Usuario();
		Usuario.setNome(usuarioDTO.getNome());
		Usuario.setEndereco(usuarioDTO.getEndereco());
		Usuario.setCpf(usuarioDTO.getCpf());
		Usuario.setEmail(usuarioDTO.getEmail());
		Usuario.setTelefone(usuarioDTO.getTelefone());
		Usuario.setDataCadastro(usuarioDTO.getDataCadastro());
		return	Usuario;
	
	
	}
	
}
