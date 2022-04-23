package recipe.recipesspring.repositories;

import org.springframework.data.repository.CrudRepository;
import recipe.recipesspring.model.Recipe;

public interface RecipeReposiroty extends CrudRepository<Recipe, Long> {
}
