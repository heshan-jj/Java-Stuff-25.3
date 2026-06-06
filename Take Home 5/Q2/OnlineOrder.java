package Q2;

public class OnlineOrder {
    int orderID;
    String customerName;
    double itemPrice;
    double quantity;

    OnlineOrder(int orderID, String customerName, double itemPrice, double quantity){
        this.orderID = orderID;
        this.customerName = customerName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }
    double calculateTotal( double discountPercentage){
        double total;
        total = itemPrice * quantity;
        return total - (total * discountPercentage/100);
    }
    void updateQuantity(double newQuantity){
        if (newQuantity > 0){
            this.quantity = quantity + newQuantity;

        }else{
            System.out.println("Invalid quantity");
        }
    }
    String getOrderSummary(){
        return orderID + " - " + customerName + " - " + itemPrice + " - " + quantity;
    }

}
