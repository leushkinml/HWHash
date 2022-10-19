import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private double priceInRubles;
    private int quantityInKg;

    private Set<Product> products;

    public Product(String name, double priceInRubles, int quantityInKg) {
        setName(name);
        setPriceInRubles(priceInRubles);
        setQuantityInKg(quantityInKg);

        products = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.name = name;
        }
    }

    public double getPriceInRubles() {
        return priceInRubles;
    }

    public void setPriceInRubles(double priceInRubles) {
        if (priceInRubles <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.priceInRubles = priceInRubles;
        }
    }

    public int getQuantityInKg() {
        return quantityInKg;
    }

    public void setQuantityInKg(int quantityInKg) {
        if (quantityInKg <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.quantityInKg = quantityInKg;
        }
    }

    public Set<Product> getProducts() {
        return products;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (!(o instanceof Product)) return false;
//        Product product = (Product) o;
//        return Double.compare(product.getPriceInRubles(), getPriceInRubles()) == 0 && getQuantityInKg() == product.getQuantityInKg() && Objects.equals(getName(), product.getName());
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            throw new IllegalArgumentException("Повторный ввод продукта.");
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPriceInRubles(), getPriceInRubles()) == 0 && getQuantityInKg() == product.getQuantityInKg() && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPriceInRubles(), getQuantityInKg());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", priceInRubles=" + priceInRubles +
                ", quantityInKg=" + quantityInKg +
                '}';
    }
}
