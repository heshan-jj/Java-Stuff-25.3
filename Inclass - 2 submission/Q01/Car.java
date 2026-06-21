package Q01;

public class Car extends Vehicle{
    private int numdoors;

    public Car(int ID, String brand, double Speed, boolean electric, int numdoors){
        super(ID, brand, Speed, electric);
        this.numdoors = numdoors;
    }

    @Override

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Doors: " + numdoors);
    }
}