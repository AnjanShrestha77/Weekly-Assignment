/**
 * ParkingMain
 *
 * Driver program demonstrating parking lot operations.
 */

public class ParkingMain {

    public static void main(String[] args) {

        ParkingLot lot = new ParkingLot(10);

        int spot = lot.parkVehicle("ABC123");

        System.out.println("Vehicle parked at spot: " + spot);

        lot.exitVehicle("ABC123");

        System.out.println("Vehicle exited.");
    }
}