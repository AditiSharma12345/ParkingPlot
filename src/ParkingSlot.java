public class ParkingSlot {
    String name;
    boolean isAvailable = true;
    Vehicle vehicle;
    ParkingSlotType parkingSlotType;

    public ParkingSlot(String name, ParkingSlotType parkingSlotType) {
        this.name = name;
        this.parkingSlotType = parkingSlotType;
    }

    public void addVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
        this.isAvailable = false;
    }

    public void removeVehicle(Vehicle vehicle)
    {
        this.vehicle = null;
        this.isAvailable = true;
    }

}
