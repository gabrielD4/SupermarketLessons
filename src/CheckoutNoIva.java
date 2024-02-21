import java.util.Arrays;

public class CheckoutNoIva extends Checkout{
    public CheckoutNoIva(Product[] products) {
        super(products);
    }

    @Override
    protected boolean isIva() {
        return false;
    }


    @Override
    public String toString() {
        return "CheckoutNoIva{" +
                "products=" + Arrays.toString(getProducts()) +
                "price=" + getFinalPrice() +
                '}';
    }
}
