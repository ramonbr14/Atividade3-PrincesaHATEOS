package br.edu.aranoua.ramonsantos.princesas.repository;

import br.edu.aranoua.ramonsantos.princesas.modelo.*;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrincesasRepository extends JpaRepository<Princesas, Long>{
	List<Princesas> findByContent(String reino);
}
