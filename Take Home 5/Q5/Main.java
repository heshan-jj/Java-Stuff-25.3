package Q5;

public class Main {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook();
        LibraryBook book2 = new LibraryBook("B101", "The Great Gatsby", "F. Scott Fitzgerald", 5);

        System.out.println(book1.getBookInfo("A1"));
        System.out.println(book2.getBookInfo("B3"));
        System.out.println("---");

        System.out.println(book2.borrowBook(3));
        System.out.println(book2.getBookInfo("B3"));
        System.out.println("---");

        System.out.println(book2.borrowBook(4));
        System.out.println(book2.getBookInfo("B3"));
        System.out.println("---");

        book2.returnBook(2);
        System.out.println(book2.getBookInfo("B3"));
        System.out.println("---");

        System.out.println(book2.borrowBook(3));
        System.out.println(book2.getBookInfo("B3"));
    }
}

