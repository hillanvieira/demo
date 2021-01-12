package br.com.h2asolutions.page.repository;

import br.com.h2asolutions.page.model.Contato;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends MongoRepository<Contato, String> {

}
