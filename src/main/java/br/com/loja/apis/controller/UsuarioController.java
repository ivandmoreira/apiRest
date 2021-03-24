package br.com.loja.apis.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.DTO.UsuarioDTO;
import br.com.loja.apis.modelo.Usuario;
import br.com.loja.apis.persistencia.UsuarioRepository;
import br.com.loja.apis.servicos.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<UsuarioDTO> getUsuarios() {
		return usuarioService.getAll();
	}

	@GetMapping("/usuarios/{cpf}")
	public UsuarioDTO getUsuariosFiltro(@PathVariable String cpf) {
		return usuarioService.findByCpf(cpf);
	}

	@RequestMapping(value = "/newUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UsuarioDTO inserir(@RequestBody UsuarioDTO usuarioDTO) {
		System.out.println("teste");
		return usuarioService.save(usuarioDTO);
		
	}

	@DeleteMapping("/user/{id}")
	public UsuarioDTO delete(@PathVariable Long id) {
		
	return usuarioService.delete(id);
	
	}
	@GetMapping("/user/search")
	public List<UsuarioDTO> queryByName(@RequestParam(name = "nome", required = true) String nome) {
		return usuarioService.queryByName(nome);
	}
}