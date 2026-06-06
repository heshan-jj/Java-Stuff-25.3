package Q1; 


class car {
    int year;
    double price;
    String brand;

    car () {
        year = 2000;
        price = 0.00;
        brand = "Unknown";

    }

    void display() {
        System.out.println(year);
        System.out.println(brand);
        System.out.println(price);
    }
}

public class main {
    public static void main(String[] args) {
        car c1 = new car();

        c1.display();
    }
}

