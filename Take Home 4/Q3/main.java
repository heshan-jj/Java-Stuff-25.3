package Q3;
class Product {
    int productID;
    String productName;
    double unitPrice;

    Product(){
        productID = 1001;
        productName = "Google";
        unitPrice = 67.67;
    }

    Product(int productID, String productName, double unitPrice) {
        this.productID = productID;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    void applyDiscount(double percentage){
        unitPrice = unitPrice - (unitPrice * (percentage/100));
        System.out.println("unitPrice after discount: "+unitPrice);
    }
    void getProductLabel(){

        System.out.println(productID + "-" + productName + "-" + unitPrice);

    }
}
public class main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(1002, "Nothing", 367.67);

        p2.applyDiscount(15);

        p1.getProductLabel();
        p2.getProductLabel();
    }
}
