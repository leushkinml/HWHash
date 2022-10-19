import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe <P extends Product> {

    private String nameOfRecipe;
    private double costOfRecipe;
    private Set<Product> ingredients;

    private Set<Recipe> recipes;

    public Recipe(String nameOfRecipe) {
        this.nameOfRecipe = nameOfRecipe;
        this.costOfRecipe = costOfRecipe;

        ingredients = new HashSet<>();

        recipes = new HashSet<>();
    }


    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    public double getCostOfRecipe() {
        double costOfRecipe = 0;
        for (Product product : ingredients) {
            costOfRecipe = product.getPriceInRubles() + costOfRecipe;
        }
        return costOfRecipe;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public Set<Product> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe<?> recipe = (Recipe<?>) o;
        return Double.compare(recipe.getCostOfRecipe(), getCostOfRecipe()) == 0 && getNameOfRecipe().equals(recipe.getNameOfRecipe()) && getIngredients().equals(recipe.getIngredients()) && getRecipes().equals(recipe.getRecipes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfRecipe(), getCostOfRecipe(), getIngredients(), getRecipes());
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "nameOfRecipe='" + getNameOfRecipe() + '\'' +
                ", costOfRecipe=" + getCostOfRecipe() +
                ", ingredients=" + getIngredients() +
                '}';
    }
}
