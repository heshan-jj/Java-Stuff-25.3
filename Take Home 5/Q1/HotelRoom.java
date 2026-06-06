package Q1;

public class HotelRoom {
    int roomNumber;
    String roomType;
    double pricePerNight;
    boolean isBooked;

    HotelRoom(){
        roomNumber = 0;
        roomType = "Standard";
        pricePerNight = 5000.00;
        isBooked = false;
    }
    HotelRoom(int roomNumber, String roomType, double pricePerNight, boolean isBooked){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isBooked = isBooked;
    }
    double bookRoom(double nights){
        if (isBooked == false){
            isBooked = true;
            return pricePerNight * nights; 
        }else{
            System.out.println("Room already booked");
            return 0.00;
        }
    }
    void checkoutRoom() {
        isBooked = false;
        System.out.println(roomNumber + " is now available");
    }
    String getRoomSummary(){
        return "Room - " + roomNumber + " - " + roomType + " - Rs " + pricePerNight + " per night - " + " Booked - " + isBooked;
    }
}