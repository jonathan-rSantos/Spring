package org.generation.blogPessoal.repository;

import java.util.List;
import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//3. Crie um repository e um controller com um método findAll

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	
	// 5. Teste o método findAll através do postman.  *OK*
	
}

