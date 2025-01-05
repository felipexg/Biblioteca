package com.aluracursos.Biblioteca;

import com.aluracursos.Biblioteca.principal.Principal;
import com.aluracursos.Biblioteca.repositorio.IAutoresRepository;
import com.aluracursos.Biblioteca.repositorio.ILibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner {



	@Autowired
	private IAutoresRepository autoresRepository;
	@Autowired
	private ILibrosRepository librosRepository;

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autoresRepository, librosRepository);
		principal.muestraElMenu();
	}

}
