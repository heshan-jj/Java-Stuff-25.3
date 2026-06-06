package Q4;

class Laptop {
    String brand;

     void brand1() {
        System.out.println(brand);
     }
     void brand2() {
        System.out.println(brand);
     }
}

public class main {
    
    public static void main(String[] args){
        Laptop mylaptop = new Laptop();
        mylaptop.brand = "Lenovo";
        mylaptop.brand1();
        mylaptop.brand2();


    }
    
}
