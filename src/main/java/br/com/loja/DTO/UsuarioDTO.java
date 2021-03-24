package br.com.loja.DTO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.com.loja.apis.modelo.Usuario;
@Service
public class UsuarioDTO {

	private	String	nome;
	private	String	cpf;
	private	String	endereco;
	private	String	email;
	private	String	telefone;
	private	Date dataCadastro;
	
	public static	List<UsuarioDTO>	usuarios	=	new	ArrayList<UsuarioDTO>();


	@PostConstruct
	public	void	initiateList() {
		UsuarioDTO	usuarioDTO	=	new	UsuarioDTO();
		usuarioDTO.setNome("Eduardo");
		usuarioDTO.setCpf("123");
		usuarioDTO.setEndereco("Rua	a");
		usuarioDTO.setEmail("eduardo@email.com");
		usuarioDTO.setTelefone("1234-3454");
		usuarioDTO.setDataCadastro(new	Date());
		UsuarioDTO	usuarioDTO2	=	new	UsuarioDTO();
		usuarioDTO2.setNome("Luiz");
		usuarioDTO2.setCpf("456");
		usuarioDTO2.setEndereco("Rua	b");
		usuarioDTO2.setEmail("luiz@email.com");
		usuarioDTO2.setTelefone("1234-3454");
		usuarioDTO2.setDataCadastro(new	Date());
		UsuarioDTO	usuarioDTO3	=	new	UsuarioDTO();
		usuarioDTO3.setNome("Bruna");
		usuarioDTO3.setCpf("678");
		usuarioDTO3.setEndereco("Rua	c");
		usuarioDTO3.setEmail("bruna@email.com");
		usuarioDTO3.setTelefone("1234-3454");
		usuarioDTO.setDataCadastro(new	Date());
		usuarios.add(usuarioDTO);
		usuarios.add(usuarioDTO2);
		usuarios.add(usuarioDTO3);

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


	public static List<UsuarioDTO> getUsuarios() {
		return usuarios;
	}


	public static void setUsuarios(List<UsuarioDTO> usuarios) {
		UsuarioDTO.usuarios = usuarios;
	}
	
	public	static	UsuarioDTO	convert(Usuario	usuario) {
		UsuarioDTO	usuarioDTO	=	new	UsuarioDTO();
		usuarioDTO.setNome(usuario.getNome());
		usuarioDTO.setEndereco(usuario.getEndereco());
		usuarioDTO.setCpf(usuario.getCpf());
		usuarioDTO.setEmail(usuario.getEmail());
		usuarioDTO.setTelefone(usuario.getTelefone());
		usuarioDTO.setDataCadastro(usuario.getDataCadastro());
		return	usuarioDTO;
}

	
	
}
