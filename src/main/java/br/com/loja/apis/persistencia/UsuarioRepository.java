package br.com.loja.apis.persistencia;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.apis.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional <Usuario> 	findByCpf(String	cpf);
	List<Usuario>	queryByNomeLike(String	name);

}
