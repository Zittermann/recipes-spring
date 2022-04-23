package recipe.recipesspring.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    /* By default a String cannot have more than 255 characters
    * With the Lob annotation we avoid that limitation problem
    * */
    @Lob
    private String recipeNotes;

}
