package br.com.hello.demo.repository;

import br.com.hello.demo.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FormRepository extends JpaRepository<Contato, Long> {

}
