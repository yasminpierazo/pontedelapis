package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Lista;

public interface ListaRepository extends JpaRepository<Lista, Long> {
    public Lista findByEmailUsuario(String emailUsuario);

    public Lista findByIdLista(Long id);
}
