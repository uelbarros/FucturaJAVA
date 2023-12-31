package br.com.nullbank.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nullbank.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{
	
	boolean existsById(UUID id);
	
	boolean existsByCpf(String cpf);

}
