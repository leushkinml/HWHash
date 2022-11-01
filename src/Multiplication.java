import java.util.*;

public class Multiplication {

    private String multiplicationNumber;

    static List<Multiplication> multiplications = new ArrayList<>();

    public Multiplication(String multiplicationNumber) {
        this.multiplicationNumber = multiplicationNumber;

       //multiplications = new ArrayList<>();
    }


//    public static void addMultiplicationsInTask() {
//        Random random = new Random();
//        int count = 0;
//        while (count < 15) {
//            if (!multiplications.contains(multiplications)) {
//                System.out.println(Multiplication.multiplications.get(random.nextInt(39)));
//
//            }
//            count++;
//        }
//
//
//        ingredients.add(product);
//        costOfRecipe = costOfRecipe + product.getPriceInRubles()*quantityOfProduct;
//    }


    public static void addExInTask(Multiplication newEx) {
        if (!multiplications.add(newEx)) {
            throw new RuntimeException("Такой пример \"" + newEx.multiplicationNumber + "\" уже есть!");
        }
        //multiplications.add(newEx);
    }

//    int count = 0;
//        while (count < 15) {
//        for (int i = 0; i < multiplications.size(); i = i + ((int) (Math.random()*5))) {
//            System.out.println(multiplications.get(i));
//        }


    public String getMultiplicationNumber() {
        return multiplicationNumber;
    }

    public static List<Multiplication> getMultiplications() {
        return multiplications;
    }

    public static void setMultiplications(List<Multiplication> multiplications) {
        Multiplication.multiplications = multiplications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Multiplication)) return false;
        Multiplication that = (Multiplication) o;
        return Objects.equals(getMultiplicationNumber(), that.getMultiplicationNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMultiplicationNumber());
    }

    @Override
    public String toString() {
        return "Умножьте: " + multiplicationNumber;
    }
}
