import java.util.*;

public class ParkingPlot {
    private String nameOfParkingLot;
    private List<ParkingFloor> parkingFloors;
    private static ParkingPlot parkingLot=null;

    private  ParkingPlot(String nameOfParkingLot,  List<ParkingFloor> parkingFloors) {
        this.nameOfParkingLot = nameOfParkingLot;
        this.parkingFloors = parkingFloors;
    }

    public static ParkingPlot getInstance (String nameOfParkingLot,  List<ParkingFloor> parkingFloors) {
        if(parkingLot == null){
            parkingLot = new ParkingPlot(nameOfParkingLot,parkingFloors);
        }
        return parkingLot;
    }

    public void addFloors(String name, Map<ParkingSlotType, Map<String,ParkingSlot>> parkSlots){
        ParkingFloor parkingFloor = new ParkingFloor(name,parkSlots);
        parkingFloors.add(parkingFloor);
    }

    public void removeFloors(ParkingFloor parkingFloor){
        parkingFloors.remove(parkingFloor);
    }

    private ParkingSlot getParkingSlotForVehicleAndPark(Vehicle vehicle) {
        ParkingSlot parkingSlot=null;
        for(ParkingFloor floor : parkingFloors){
            parkingSlot = floor.getRelevantSlotForVehicleAndPark(vehicle);
            if(parkingSlot!= null) break;
        }
        return parkingSlot;
    }

}
