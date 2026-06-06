package Q6;

class Animal {
    String type;

    void anim(String type) {
        System.out.println(type);
    }
}

public class main {
    public static void main(String[] args) {
        Animal anim1 = new Animal();
        Animal anim2 = new Animal();

        anim1.anim("Dog");
        anim2.anim("Cat");
    }
}
