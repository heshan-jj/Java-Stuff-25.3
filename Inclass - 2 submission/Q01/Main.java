package Q01;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(01, "Toyata", 180.00, true);
        
         Car c = new Car(02, "Benz", 240, true, 2);
    
         v.displayInfo();

         c.displayInfo();
    }

}
