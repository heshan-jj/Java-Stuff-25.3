package Q1;

public class Main {
    public static void main (String[] args){
        HotelRoom room1 = new HotelRoom(1001, "Deluxe", 7500, false);
        HotelRoom room2 = new HotelRoom(1002, "Villa", 12000, false);

        System.out.println(room2.bookRoom(3));
        System.out.println(room2.bookRoom(2));

        room2.checkoutRoom();
        System.out.println(room2.bookRoom(3));

        System.out.println(room1.getRoomSummary());
        System.out.println(room2.getRoomSummary());
    }
}
