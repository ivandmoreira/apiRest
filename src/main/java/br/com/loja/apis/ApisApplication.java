package br.com.loja.apis;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import br.com.loja.apis.modelo.Usuario;
import br.com.loja.apis.persistencia.UsuarioRepository;

@SpringBootApplication
public class ApisApplication {

	public static void main(String[] args) {			
		SpringApplication.run(ApisApplication.class, args);
	}

}
