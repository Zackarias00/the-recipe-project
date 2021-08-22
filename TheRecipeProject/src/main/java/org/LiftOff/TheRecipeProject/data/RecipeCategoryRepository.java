package org.LiftOff.TheRecipeProject.data;

import org.LiftOff.TheRecipeProject.models.RecipeCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeCategoryRepository extends CrudRepository<RecipeCategory, Integer> {
}
