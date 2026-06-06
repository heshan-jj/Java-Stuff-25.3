package Q2;

public class Main {
    public static void main(String[] args) {
        OnlineOrder order01 = new OnlineOrder(001, "Heshan", 100, 10 );
        OnlineOrder order02 = new OnlineOrder(002, "Hasitha", 1000, 10 );

        System.out.println(order01.calculateTotal(10));
        order02.updateQuantity(10);
        System.out.println(order02.calculateTotal(0));
        order02.updateQuantity(0);

        System.out.println(order01.getOrderSummary());
        System.out.println(order02.getOrderSummary());
    }
}
