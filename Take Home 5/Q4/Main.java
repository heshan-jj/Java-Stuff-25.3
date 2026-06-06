package Q4;

public class Main {
    

    public static void main(String[] args) {
        VehicleRental vehicle1 = new VehicleRental();
        VehicleRental vehicle2 = new VehicleRental(002, "bike", 0.5, 20.0, true);
       
        System.out.println(vehicle1.getVehicleInfo());
        System.out.println(vehicle2.getVehicleInfo());
        System.out.println("---");

        System.out.println(vehicle1.rentVehicle(3, 5.0));
        System.out.println(vehicle1.getVehicleInfo());
        System.out.println("---");

        vehicle1.returnVehicle(4.0);
        System.out.println(vehicle1.getVehicleInfo());
        System.out.println("---");

        System.out.println(vehicle2.rentVehicle(2, 15.0));
        System.out.println(vehicle2.getVehicleInfo());
    }
}
