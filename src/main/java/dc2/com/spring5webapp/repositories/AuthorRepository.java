package dc2.com.spring5webapp.repositories;

import dc2.com.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author,Long>{
}
