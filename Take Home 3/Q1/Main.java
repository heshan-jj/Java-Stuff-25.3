package Q1;
class Book {  //defining the class
    String title; //decalring the variable

}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(); //create the object

        b1.title = "Harry Potter";

        System.out.println(b1.title);
    }
}