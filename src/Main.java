import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("ДЗ 1. Задание 1.");
        Product banana = new Product("Банан", 52.1, 2, true);
        Product orange = new Product("Апельсин", 23.86, 3, true);
        Product milk = new Product("Молоко", 6.52, 5, false);
        Product bread = new Product("Хлеб", 12.1, 7, false);
        Product salt = new Product("Соль", 0.56, 3, false);
        Product butter = new Product("Масло", 36, 11, false);

        Set<Product> productsToBuy = new HashSet<>();
//        productsToBuy.add(new Product("Банан", 52.1, 2, true));
//        productsToBuy.add(new Product("Апельсин", 23.86, 3, false));
//        productsToBuy.add(new Product("Молоко", 6.52, 5, true));
//        productsToBuy.add(new Product("Молоко", 54.52, 5, false));
//        productsToBuy.add(new Product("Хлеб", 12.1, 7, false));
//        productsToBuy.add(new Product("Соль", 0.56, 3, false));
//        productsToBuy.add(new Product("Масло", 36, 11, false));
//        productsToBuy.add(new Product("Соль", 13, 28,false));

        productsToBuy.add(banana);
        productsToBuy.add(orange);
        productsToBuy.add(milk);
        productsToBuy.add(milk);
        productsToBuy.add(bread);
        productsToBuy.add(salt);
        productsToBuy.add(butter);

        for (Product product : productsToBuy) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println(Arrays.toString(productsToBuy.toArray()));
        System.out.println();

        productsToBuy.remove(banana);

        System.out.println(Arrays.toString(productsToBuy.toArray()));
        System.out.println();

        System.out.println();
        System.out.println("ДЗ 2. Задание 1.");

        Recipe cake = new Recipe("Торт");
        cake.getIngredients().add(milk);
        cake.getIngredients().add(salt);
        cake.getIngredients().add(butter);

        Recipe coctail = new Recipe("Коктейль");
        coctail.getIngredients().add(milk);
        coctail.getIngredients().add(orange);

        Recipe coctailFresh = new Recipe("Коктейль Фреш");
        coctailFresh.getIngredients().add(milk);
        coctailFresh.getIngredients().add(orange);

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(cake);
        recipes.add(cake);
        recipes.add(coctail);
        recipes.add(coctailFresh);
        System.out.println();

        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
        System.out.println();

        System.out.println();
        System.out.println("ДЗ 2. Задание 2.");

        List<Integer> numbers = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            numbers.add((int) (Math.random()*1000));
        }
        System.out.println(numbers);
        numbers.removeIf(i -> (i% 2) != 0);
        System.out.println(numbers);

        System.out.println();
        System.out.println("ДЗ 3. Задание 3.");


        Passport passport1 = new Passport("123456789", "Иванов", "Иван", "Иванович", "15.03.1969");
        Passport passport2 = new Passport("987654321", "Петров", "Пётр", "Петрович", "25.04.1971");

        System.out.println(passport1);

        Set<Passport> passports = new HashSet<>();
        passports.add(passport1);
        passports.add(passport2);

//        System.out.println(getPassportByNumber("123456789"));


        System.out.println();
        System.out.println("ДЗ 3. Задание 3.");

        List<Multiplication> multiplication = new ArrayList<>();
        multiplication.add(new Multiplication("2*2"));
        multiplication.add(new Multiplication("2*3"));
        multiplication.add(new Multiplication("2*4"));
        multiplication.add(new Multiplication("2*5"));
        multiplication.add(new Multiplication("2*6"));
        multiplication.add(new Multiplication("2*7"));
        multiplication.add(new Multiplication("2*8"));
        multiplication.add(new Multiplication("2*9"));
        multiplication.add(new Multiplication("3*3"));
        multiplication.add(new Multiplication("3*4"));
        multiplication.add(new Multiplication("3*5"));
        multiplication.add(new Multiplication("3*6"));
        multiplication.add(new Multiplication("3*7"));
        multiplication.add(new Multiplication("3*8"));
        multiplication.add(new Multiplication("3*9"));
        multiplication.add(new Multiplication("4*4"));
        multiplication.add(new Multiplication("4*5"));
        multiplication.add(new Multiplication("4*6"));
        multiplication.add(new Multiplication("4*7"));
        multiplication.add(new Multiplication("4*8"));
        multiplication.add(new Multiplication("4*9"));
        multiplication.add(new Multiplication("5*5"));
        multiplication.add(new Multiplication("5*6"));
        multiplication.add(new Multiplication("5*7"));
        multiplication.add(new Multiplication("5*8"));
        multiplication.add(new Multiplication("5*9"));
        multiplication.add(new Multiplication("6*6"));
        multiplication.add(new Multiplication("6*7"));
        multiplication.add(new Multiplication("6*8"));
        multiplication.add(new Multiplication("6*9"));
        multiplication.add(new Multiplication("7*7"));
        multiplication.add(new Multiplication("7*8"));
        multiplication.add(new Multiplication("7*9"));
        multiplication.add(new Multiplication("8*8"));
        multiplication.add(new Multiplication("8*9"));
        multiplication.add(new Multiplication("9*9"));

        System.out.println(multiplication);
        System.out.println();

        for (int i = 0; i < multiplication.size(); i = i + ((int) (Math.random()*10))) {
            System.out.println(multiplication.get(i));
        }
//        for (Multiplication multiplication1: multiplication) {
//            System.out.println(multiplication1);
//        }

        System.out.println();
        System.out.println("ДЗ 3. Задание 4." +
                "ArrayList. Так как containsAll(list) будет перебирать все элементы коллекции, " +
                "то меньше времени потребуется на обработку наиболее простой коллекции.");
    }

//    public static Passport getPassportByNumber(String checkNumber) {
//        for (Passport passport: passports) {
//            if (checkNumber.equals(passport.getPassportNumber())) {
//                return passport;
//            }
//        }
//        return null;
//    }


//    public static void printMultiplication() {
//        for (Multiplication numbers: ) {
//
//        }
//    }
}