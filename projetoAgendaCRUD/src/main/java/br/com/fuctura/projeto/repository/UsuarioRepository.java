package br.com.fuctura.projeto.repository;

import br.com.fuctura.projeto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//do repository ate o banco de dados ele ja tem os metodos todos prontos pq extende essa classe JpaRepository
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    List<Usuario> findByNomeContaining(String nome);
}
