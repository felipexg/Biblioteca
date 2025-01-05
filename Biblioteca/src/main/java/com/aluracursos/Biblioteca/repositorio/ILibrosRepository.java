package com.aluracursos.Biblioteca.repositorio;

import com.aluracursos.Biblioteca.models.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ILibrosRepository extends JpaRepository<Libros, Long> {
    Libros findByTitulo(String titulo);

    List<Libros> findByLenguajesContaining(String lenguaje);
}
