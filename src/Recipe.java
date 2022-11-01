import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe //<P extends Product>
{

    private String nameOfRecipe;
    private static double costOfRecipe;
    static Set<Product> ingredients = new HashSet<>();
    static Set<Recipe> recipesList = new HashSet<>();

//    static HashMap<Product, Integer> productForRecipe = new HashMap<>();

    public Recipe(String nameOfRecipe) {
        setNameOfRecipe(nameOfRecipe);
        this.costOfRecipe = 0;
        //recipesList.add(this);
        Set<Product> ingredients;
        Set<Recipe> recipesList;

    }
    public static void addProductInRecipe(Product product, int quantityOfProduct) {
        if (ingredients.contains(product)) {
            throw new RuntimeException("Такой продукт \"" + product.getName() + "\" уже добавлен в рецепт!");
        }
        ingredients.add(product);
        costOfRecipe = costOfRecipe + product.getPriceInRubles()*quantityOfProduct;
    }

    public static void addRecipeInList(Recipe newRecipe) {
        if (!recipesList.add(newRecipe)) {
            throw new RuntimeException("Такой рецепт \"" + newRecipe.nameOfRecipe + "\" уже есть!");
        }
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
//    public double getCostOfRecipe() {
//        double costOfRecipe = 0;
//        for (Product product : ingredients) {
//            costOfRecipe = product.getPriceInRubles()*product.getQuantityInKg() + costOfRecipe;
//        }
//        return costOfRecipe;
//    }
//    public double getCostOfRecipe() {
//        double costOfRecipe = 0;
//        for (Product product : ingredients) {
//            costOfRecipe = product.getPriceInRubles() + costOfRecipe;
//        }
//        return costOfRecipe;
//    }


    public static Set<Recipe> getRecipesList() {
        return recipesList;
    }

    public Set<Product> getIngredients() {
        return ingredients;
    }
//    public HashMap<Product, Integer> getProductForRecipe() {
//        return productForRecipe;
//    }
//
//    public void setProductForRecipe(HashMap<Product, Integer> productForRecipe) {
////        if (productForRecipe.values() == null)
//        this.productForRecipe = productForRecipe;
//    }

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
                ", costOfRecipe=" + costOfRecipe +
                ", ingredients=" + getIngredients() +
                '}';
    }
}
