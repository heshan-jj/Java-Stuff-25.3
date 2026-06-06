package Q5;

class Mobile {
    String Model;

    void show() {
        System.out.println(Model);
    }
}


public class main {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.Model = "Samsung";
        m1.show();
    }
    
}
