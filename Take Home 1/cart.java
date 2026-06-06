public class cart {
    public static void main(String[] args){
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char dollar = '$' ;
        System.out.println("Items bought = " + items);
        System.out.println("Cost Per Item " + costPerItem);
        System.out.println("Total cost = " + totalCost + dollar);
    }
}
