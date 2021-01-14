package br.com.h2asolutions.page.repository;

import br.com.h2asolutions.page.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Contato, Long> {

}
