import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Pizza", 2, 0.1, ProdcutType.food);
        Product product2 = new Product("Coca Cola", 0.99, 0.22, ProdcutType.drink);
        Product[] products = new Product[]{product1, product2};

        CheckoutNoIva checkoutNoIva = new CheckoutNoIva(products);
        System.out.println("Checkout without iva: ");
        System.out.println("Products quantity: " + Arrays.toString(checkoutNoIva.getProducts()));
        System.out.println("Final price (without iva); " + checkoutNoIva.getFinalPrice());
        System.out.println("CheckoutNoIva toString: " + checkoutNoIva);
        System.out.println();

        CheckoutIva checkoutIva = new CheckoutIva(products);
        System.out.println("Checkout with iva: ");
        System.out.println("Products quantity: " + Arrays.toString(checkoutIva.getProducts()));
        System.out.println("Final price (with iva): " + checkoutIva.getFinalPrice());
        System.out.println("CheckoutIva toString: " + checkoutIva);
        System.out.println();
    }
}