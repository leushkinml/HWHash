import java.util.*;

public class Multiplication {

    private String multiplicationNumber;

    private static List<Multiplication> multiplications;

    public Multiplication(String multiplicationNumber) {
        this.multiplicationNumber = multiplicationNumber;

        multiplications = new ArrayList<>();
    }

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
        return "Multiplication{" +
                "multiplicationNumber='" + multiplicationNumber + '\'' +
                '}';
    }
}
