package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Doacao;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {
    
}
