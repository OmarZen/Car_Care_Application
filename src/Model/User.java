package Model;

import java.time.Instant;

public class User {
    private String Name;
    private Vehicle vehicle;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicleInfo(String modelName, int uniqueID, int length, int width, int modelYear, boolean passengerType, Instant ArrivalTime) {
        vehicle = new Vehicle(modelName, uniqueID, length, width, modelYear, passengerType, ArrivalTime);
    }
}
