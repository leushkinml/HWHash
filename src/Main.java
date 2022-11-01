import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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

        Product.addProductInList(banana);
        Product.addProductInList(orange);
        Product.addProductInList(milk);
        Product.addProductInList(bread);
        Product.addProductInList(salt);
        Product.addProductInList(butter);
       // Product.addProductInList(butter); // Выбрасывает исключение


        System.out.println();
        System.out.println(Arrays.toString(Product.productsList.toArray()));
        System.out.println();

        Product.productsList.remove(banana);

        System.out.println(Arrays.toString(Product.productsList.toArray()));
        System.out.println();

        System.out.println();
        System.out.println("ДЗ 2. Задание 1.");

        Recipe cake = new Recipe("Торт");
//        Recipe.addProductInRecipe(banana, 3);
//        Recipe.addProductInRecipe(salt, 1);

        Recipe coctail = new Recipe("Коктейль");


        Recipe coctailFresh = new Recipe("Коктейль Фреш");


        Recipe.addRecipeInList(cake);
        //Recipe.addRecipeInList(cake);// Выбрасывает исключение
        Recipe.addRecipeInList(coctail);
        Recipe.addRecipeInList(coctailFresh);
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


        Passport passport1 = new Passport(123456789, "Иванов", "Иван", "Иванович", "15.03.1969");
        Passport passport2 = new Passport(987654321, "Петров", "Пётр", "Петрович", "25.04.1971");

        //System.out.println(passport1);

        Passport.listOfPassports.add(passport1);
        Passport.listOfPassports.add(passport2);

        Passport.getPassportByNumber(987654321);
        //Passport.getPassportByNumber(54321);


        System.out.println();
        System.out.println("ДЗ 3. Задание 2.");


        Multiplication ex1 = new Multiplication("2*2");
        Multiplication ex2 = new Multiplication("2*3");
        Multiplication ex3 = new Multiplication("2*4");
        Multiplication ex4 = new Multiplication("2*5");
        Multiplication ex5 = new Multiplication("2*3");
        Multiplication ex6 = new Multiplication("2*4");
        Multiplication ex7 = new Multiplication("2*5");
        Multiplication ex8 = new Multiplication("2*6");
        Multiplication ex9 = new Multiplication("2*7");
        Multiplication ex10 = new Multiplication("2*8");
        Multiplication ex11 = new Multiplication("2*9");
        Multiplication ex12 = new Multiplication("3*3");
        Multiplication ex13 = new Multiplication("3*4");
        Multiplication ex14 = new Multiplication("3*5");
        Multiplication ex15 = new Multiplication("3*6");
        Multiplication ex16 = new Multiplication("3*7");
        Multiplication ex17 = new Multiplication("3*8");
        Multiplication ex18 = new Multiplication("3*9");
        Multiplication ex19 = new Multiplication("4*4");
        Multiplication ex20 = new Multiplication("4*5");
        Multiplication ex21 = new Multiplication("4*6");
        Multiplication ex22 = new Multiplication("4*7");
        Multiplication ex23 = new Multiplication("4*8");
        Multiplication ex24 = new Multiplication("4*9");
        Multiplication ex25 = new Multiplication("5*5");
        Multiplication ex26 = new Multiplication("5*6");
        Multiplication ex27 = new Multiplication("5*7");
        Multiplication ex28 = new Multiplication("5*8");
        Multiplication ex29 = new Multiplication("5*9");
        Multiplication ex30 = new Multiplication("6*6");
        Multiplication ex31 = new Multiplication("6*7");
        Multiplication ex32 = new Multiplication("6*8");
        Multiplication ex33 = new Multiplication("6*9");
        Multiplication ex34 = new Multiplication("7*7");
        Multiplication ex35 = new Multiplication("7*8");
        Multiplication ex36 = new Multiplication("7*9");
        Multiplication ex37 = new Multiplication("8*8");
        Multiplication ex38 = new Multiplication("8*9");
        Multiplication ex39 = new Multiplication("9*9");

        Multiplication.addExInTask(ex1);
        Multiplication.addExInTask(ex2);
        Multiplication.addExInTask(ex3);
        Multiplication.addExInTask(ex4);
        Multiplication.addExInTask(ex5);
        Multiplication.addExInTask(ex6);
        Multiplication.addExInTask(ex7);
        Multiplication.addExInTask(ex8);
        Multiplication.addExInTask(ex9);
        Multiplication.addExInTask(ex10);
        Multiplication.addExInTask(ex11);
        Multiplication.addExInTask(ex12);
        Multiplication.addExInTask(ex13);
        Multiplication.addExInTask(ex14);
        Multiplication.addExInTask(ex15);
        Multiplication.addExInTask(ex16);
        Multiplication.addExInTask(ex17);
        Multiplication.addExInTask(ex18);
        Multiplication.addExInTask(ex19);
        Multiplication.addExInTask(ex20);
        Multiplication.addExInTask(ex21);
        Multiplication.addExInTask(ex22);
        Multiplication.addExInTask(ex23);
        Multiplication.addExInTask(ex24);
        Multiplication.addExInTask(ex25);
        Multiplication.addExInTask(ex26);
        Multiplication.addExInTask(ex27);
        Multiplication.addExInTask(ex28);
        Multiplication.addExInTask(ex29);
        Multiplication.addExInTask(ex30);
        Multiplication.addExInTask(ex31);
        Multiplication.addExInTask(ex32);
        Multiplication.addExInTask(ex33);
        Multiplication.addExInTask(ex34);
        Multiplication.addExInTask(ex35);
        Multiplication.addExInTask(ex36);
        Multiplication.addExInTask(ex37);
        Multiplication.addExInTask(ex38);
        Multiplication.addExInTask(ex39);

//        for (Multiplication multiplication1: Multiplication.getMultiplications()) {
//            System.out.println(multiplication1);
//        }

//        int count = 0;
//        while (count < 15) {
//            for (int i = 0; i < 39; i = i + ((int) (Math.random() * 10))) {
//                System.out.println(Multiplication.multiplications.get(i));
//                count++;
//            }
//        }
        Random random = new Random();
        int count = 0;
        while (count < 15) {
            //for (int i = 0; i < 39; i = random.nextInt(39)) {
                System.out.println(Multiplication.multiplications.get(random.nextInt(39)));

            //}
            count++;
        }


//        int count = 0;
//        while (count < 15) {
//            for (int i = 0; i < 39; i = i + (int)(Math.random()*Multiplication.multiplications.size())) {
//                System.out.println(Multiplication.multiplications.get(i));
//                count++;
//            }
//        }

        System.out.println();
        System.out.println("ДЗ 3. Задание 4." +
                "HashList. Так как containsAll(list) будет перебирать все элементы коллекции, " +
                "то меньше времени потребуется на обработку по хеш-коду.");

        System.out.println();
        System.out.println("Map. ДЗ 1. Задание 1.");

        Map<String, String> manPhone = new HashMap<>();
        manPhone.put("Иванов 1", "+7916111-11-01");
        manPhone.put("Иванов 2", "+7916111-11-02");
        manPhone.put("Иванов 3", "+7916111-11-03");
        manPhone.put("Иванов 4", "+7916111-11-04");
        manPhone.put("Иванов 5", "+7916111-11-05");
        manPhone.put("Иванов 6", "+7916111-11-06");
        manPhone.put("Иванов 7", "+7916111-11-07");
        manPhone.put("Иванов 8", "+7916111-11-08");
        manPhone.put("Иванов 9", "+7916111-11-09");
        manPhone.put("Иванов 10", "+7916111-11-10");
        manPhone.put("Иванов 11", "+7916111-11-11");
        manPhone.put("Иванов 12", "+7916111-11-12");
        manPhone.put("Иванов 13", "+7916111-11-13");
        manPhone.put("Иванов 14", "+7916111-11-14");
        manPhone.put("Иванов 15", "+7916111-11-15");
        manPhone.put("Иванов 16", "+7916111-11-16");
        manPhone.put("Иванов 17", "+7916111-11-17");
        manPhone.put("Иванов 18", "+7916111-11-18");
        manPhone.put("Иванов 19", "+7916111-11-19");
        manPhone.put("Иванов 20", "+7916111-11-20");

        System.out.println(manPhone);

//        for (Map.Entry<String, String> contact: manPhone.entrySet()) {
//            System.out.println("Контакт " + pair.getKey() + ": " + pair.getValue());
//        }
//        for (String name: manPhone.keySet()) {
//            System.out.println("В мапе присутствует контакт по имени " + name);
//        }
//        for (String phoneNumber: manPhone.values()) {
//            System.out.println("В мапе присутствует номер телефона  " + phoneNumber);
//        }

        System.out.println();
        System.out.println("Map. ДЗ 1. Задание 2.");
//
        Recipe.addProductInRecipe(milk, 2);
        Recipe.addProductInRecipe(salt, 1);
        Recipe.addProductInRecipe(butter, 3);
        Recipe.addProductInRecipe(banana, 1);

        System.out.println(Recipe.recipesList);

        System.out.println();
        System.out.println("Map. ДЗ 1. Задание 3. В Классе Training");

        System.out.println();
        System.out.println("Map. ДЗ 2. Задание 1. в  Классе MapTest");

        System.out.println();
        System.out.println("Map. ДЗ 2. Задание 2.");

        HashMap<Integer, String> oderedMap = new LinkedHashMap<>();
        oderedMap.put(91, "Один");
        oderedMap.put(82, "Два");
        oderedMap.put(73, "Три");
        oderedMap.put(64, "Четыре");
        oderedMap.put(55, "Пять");
        oderedMap.put(46, "Шесть");
        oderedMap.put(37, "Семь");
        oderedMap.put(28, "Восемь");
        oderedMap.put(19, "Девять");
        oderedMap.put(10, "Десять");

        System.out.println(oderedMap);

        }
}
