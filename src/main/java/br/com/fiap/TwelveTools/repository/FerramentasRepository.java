package br.com.fiap.TwelveTools.repository;

import br.com.fiap.TwelveTools.model.Ferramentas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FerramentasRepository extends JpaRepository<Ferramentas, Long> {
}
