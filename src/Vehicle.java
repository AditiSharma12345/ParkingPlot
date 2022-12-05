
public class Vehicle {
    String vehicleNumber;
    VehicleCategory vehicleCategory;

    public VehicleCategory getVehicleCategory() {

        return vehicleCategory;
    }

    public void setVehicleCategory(VehicleCategory vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
