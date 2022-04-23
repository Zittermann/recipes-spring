package recipe.recipesspring.repositories;

import org.springframework.data.repository.CrudRepository;
import recipe.recipesspring.model.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
