package Q4;

public class VehicleRental {
   int vehicleid;
   String vehicletype;
   double rateperday;
   double availablekm;
   boolean isAvailable;

   VehicleRental(){
    vehicleid=001;
    vehicletype="car";
    rateperday=1.0;
    availablekm=10.0;
    isAvailable=true;
   }
   VehicleRental(int vehicleid, String vehicletype, double rateperday, double availablekm, boolean isAvailable){
    this.vehicleid=vehicleid;
    this.vehicletype=vehicletype;
    this.rateperday=rateperday;
    this.availablekm=availablekm;
    this.isAvailable=isAvailable;
   }
   String rentVehicle(int days, double estimatedKm){
        if (isAvailable == true && estimatedKm <= availablekm){
            double total;
            total = rateperday * days;
            this.isAvailable = false;
            return "Total Cost: Rs." + total;
        }else{
            return "Unavailable to book";
        }
   }
   void returnVehicle(double kmUsed){
        this.availablekm = availablekm - kmUsed;
        isAvailable = true;
        if (availablekm != 0){
            System.out.println(vehicleid + " is now available ");
        }else{
            System.out.println(vehicleid + " is not available ");
        }
   }
   String getVehicleInfo(){
        return "Vehicle ID: " + vehicleid + "\n" +
                "Vehicle Type: " + vehicletype + "\n" +
                "Rate per Day: Rs." + rateperday + "\n" +
                "Available KM: " + availablekm + "\n" +
                "Availability: " + (isAvailable ? "Available" : "Not Available");
   }


}
