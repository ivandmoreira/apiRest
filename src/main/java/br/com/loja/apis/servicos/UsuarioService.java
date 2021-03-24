package br.com.loja.apis.servicos;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loja.DTO.UsuarioDTO;
import br.com.loja.apis.modelo.Usuario;
import br.com.loja.apis.persistencia.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	public List<UsuarioDTO> getAll() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(UsuarioDTO::convert).collect(Collectors.toList());
	}

	public UsuarioDTO findById(long userId) {
		Optional<Usuario> usuario = usuarioRepository.findById(userId);
		if (usuario.isPresent()) {
			return UsuarioDTO.convert(usuario.get());
		}
		return null;
	}

	public UsuarioDTO save(UsuarioDTO usuarioDTO) {
		Usuario usuario = usuarioRepository.save(Usuario.convert(usuarioDTO));
		return UsuarioDTO.convert(usuario);
	}

	public UsuarioDTO delete(long usuarioId) {
		Optional<Usuario> usuario = usuarioRepository.findById(usuarioId);
		if (usuario.isPresent()) {
			usuarioRepository.delete(usuario.get());
		}
		return null;
	}

	public UsuarioDTO findByCpf(String cpf) {
		Optional<Usuario> usuario = usuarioRepository.findByCpf(cpf);
		if (usuario.isPresent()) {
			return UsuarioDTO.convert(usuario.get());
		}
		return null;
	}

	public List<UsuarioDTO> queryByName(String name) {
		List<Usuario> usuarios = usuarioRepository.queryByNomeLike(name);
		return usuarios.stream().map(UsuarioDTO::convert).collect(Collectors.toList());
	}

}
