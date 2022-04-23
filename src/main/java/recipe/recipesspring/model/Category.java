package recipe.recipesspring.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    /*
    * mappedBy must contain the same name as
    * the Set in the Recipe class.
    * In this case: categories
    */
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
