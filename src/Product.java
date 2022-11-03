import java.util.*;

public class Product {
    private String name;
    private double priceInRubles;
    private int quantityInKg;

    private boolean boughtOrNot;

    static Set<Product> productsList = new HashSet<>();

    public Product(String name, double priceInRubles, int quantityInKg,boolean boughtOrNot) {
        setName(name);
        setPriceInRubles(priceInRubles);
        setQuantityInKg(quantityInKg);
        setBoughtOrNot(boughtOrNot);
    }

//    public static void addProductInList(Product newProduct) {
//        if (productsList.contains(newProduct)) {
//            productsList.add(newProduct);
//        } else {
//            throw new RuntimeException("Такой продукт уже есть!");
//        }
//    }

    public static void addProductInList(Product newProduct) {
        if (!productsList.add(newProduct)) {
            throw new RuntimeException("Такой продукт \"" + newProduct.name + "\" уже есть!");
        }
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.name = name;
        }
    }

    public double getPriceInRubles() {
        return priceInRubles;
    }

    private void setPriceInRubles(double priceInRubles) {
        if (priceInRubles <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.priceInRubles = priceInRubles;
        }
    }

    public int getQuantityInKg() {
        return quantityInKg;
    }

    private void setQuantityInKg(int quantityInKg) {
        if (quantityInKg <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.quantityInKg = quantityInKg;
        }
    }

    public boolean isBoughtOrNot() {
        return boughtOrNot;
    }

    private void setBoughtOrNot(boolean boughtOrNot) {
        this.boughtOrNot = boughtOrNot;
    }

    public Set<Product> getProducts() {
        return productsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getName(), product.getName()) && Objects.equals(getProducts(), product.getProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Продукт: " +
                "Наименование: " + name +
                ", Цена в рублях: " + priceInRubles +
                ", Количество в кг: " + quantityInKg +
                ", Куплен: " + boughtOrNot +
                '.';
    }
}
