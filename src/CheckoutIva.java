import java.util.Arrays;

public class CheckoutIva extends Checkout{
    public CheckoutIva(Product[] products) {
        super(products);
    }

    @Override
    protected boolean isIva() {
        return true;
    }


    @Override
    public String toString() {
        return "CheckoutIva{" +
                "products=" + Arrays.toString(getProducts()) +
                "price=" + getFinalPrice() +
                '}';
    }
}
