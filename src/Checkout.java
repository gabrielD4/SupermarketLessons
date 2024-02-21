import java.util.Arrays;

public abstract class Checkout {
    private Product[] products;

    public Checkout(Product[] products) {
        setProducts(products);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    protected abstract boolean isIva();

    public double getFinalPrice() {
        double finalPrice = 0.0d;

        for (Product product : getProducts()) {
            finalPrice += product.getPrice(isIva());
        }
        return finalPrice;
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "products=" + Arrays.toString(getProducts()) +
                '}';
    }
}
