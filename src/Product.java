enum ProductType {
    food,
    drink
}
public class Product {
    private final String name;

    private final double price;

    private final double iva;

    private final ProductType type;

    public Product(String name, double price, double iva, ProductType type) {
        this.name = name;
        this.price = price;
        this.iva = iva;
        this.type = type;
    }

    public ProductType getType() {
        return type;
    }

    public double getPrice(boolean withIva) {
        if (withIva) {
            return price + price * iva;
        } else {
            return price;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
