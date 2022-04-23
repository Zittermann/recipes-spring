package recipe.recipesspring.repositories;

import org.springframework.data.repository.CrudRepository;
import recipe.recipesspring.model.Recipe;

import java.util.Optional;

public interface RecipeReposiroty extends CrudRepository<Recipe, Long> {

    Optional<Recipe> findByDescription(String description);

}
