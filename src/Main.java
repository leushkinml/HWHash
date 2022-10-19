import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Product banana = new Product("Банан", 52.1, 2);
        Product orange = new Product("Апельсин", 23.86, 3);
        Product milk = new Product("Молоко", 6.52, 5);
        Product bread = new Product("Хлеб", 12.1, 7);
        Product salt = new Product("Соль", 0.56, 3);

        //System.out.println(banana);

        Set<Product> products = new HashSet<>();
        products.add(banana);
        products.add(orange);
        products.add(milk);
        products.add(milk);
        products.add(milk);
        products.add(milk);
        products.add(bread);
        products.add(salt);
        products.add(new Product("Масло", 36, 11));

        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();
        System.out.println(Arrays.toString(products.toArray()));
        System.out.println();



        products.remove(banana);
        System.out.println(Arrays.toString(products.toArray()));
        System.out.println();

        Recipe cake = new Recipe("Торт");
        cake.getIngredients().add(milk);
        cake.getIngredients().add(salt);
        System.out.println(cake);

        Recipe coctail = new Recipe("Коктейль");
        coctail.getIngredients().add(milk);
        coctail.getIngredients().add(orange);
        System.out.println(coctail);

        Recipe coctailFresh = new Recipe("Коктейль Фреш");
        coctail.getIngredients().add(milk);
        coctail.getIngredients().add(orange);
        System.out.println(coctailFresh);

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(cake);
        recipes.add(cake);
        recipes.add(coctail);
        recipes.add(coctailFresh);

        System.out.println();
        System.out.println(Arrays.toString(recipes.toArray()));


        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
        System.out.println();
       // ДЗ 2 Задание 2

        Set<Integer> numbers = new HashSet<>(20);
        for (int i = 0; i < 20; i++) {
            numbers.add((int) (Math.random()*1000));
        }

//        for (Integer number: numbers) {
//            numbers.add((int) (Math.random()*1000));
//        }

        for (Integer number: numbers) {
            System.out.println(number);
        }

//        for (Integer number: numbers) {
//            if (numbers % 2 != 0) {
//
//            }
//        }
//        for (int i = 0; i < 20; i++) {
//            if ((numbers[i] % 2) == 0) {
//            }
//        }

    }
}