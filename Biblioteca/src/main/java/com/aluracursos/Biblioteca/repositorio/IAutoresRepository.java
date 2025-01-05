package com.aluracursos.Biblioteca.repositorio;
import com.aluracursos.Biblioteca.models.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface IAutoresRepository extends JpaRepository<Autore, Long> {
    Autore findByNameIgnoreCase(String nombre);

    List<Autore> findByAñoNacimientoLessThanEqualAndAñoMuerteGreaterThanEqual(int añoInicial, int añoFinal);
}
