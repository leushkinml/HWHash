import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe //<P extends Product>
{

    private String nameOfRecipe;
    private double costOfRecipe;
    private Set<Product> ingredients;
    private Set<Recipe> recipes;


    public Recipe(String nameOfRecipe) {
        setNameOfRecipe(nameOfRecipe);

        ingredients = new HashSet<>();

        recipes = new HashSet<>();
    }


    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    private void setNameOfRecipe(String nameOfRecipe) {
        if (nameOfRecipe == null || nameOfRecipe.isEmpty() || nameOfRecipe.isBlank()) {
            throw new IllegalArgumentException("Заполните название рецепта.");
        } else {
            this.nameOfRecipe = nameOfRecipe;
        }
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
        Recipe recipe = (Recipe) o;
        return Objects.equals(getNameOfRecipe(), recipe.getNameOfRecipe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfRecipe());
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
