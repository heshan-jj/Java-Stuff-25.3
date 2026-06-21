package Q01;

public class Vehicle {
    private int ID;
    private String brand;
    private double Speed;
    private boolean electric;

    Vehicle (int ID, String brand, double Speed, boolean electric){
        this.ID = ID;
        this.brand = brand;
        this.Speed = Speed;
        this.electric = electric;
    }

    public int getVehicleID(){
        return ID;
    }
    public void setVehicleID(int ID){
        this.ID = ID;
    }

    public String getbrand(){
        return brand;
    }
    public void setbrand(String brand){
        this.brand = brand;
    }
    
    public double getSpeed(){
        return Speed;
    }
    public void setSpeed(double Speed){
        this.Speed = Speed;
    }

    public boolean getE(){
        return electric;
    }
    public void setE(boolean electric){
        this.electric = electric;
    }

    public void displayInfo() {
        System.out.println("Vehicle ID is: " + ID);
        System.out.println("Vehicle Brad is: " + brand);
        System.out.println("Vehicle Speed is: " + Speed + "km/h");
        System.out.println("Electric Power: " + electric);
    }
}