package Model;

import java.time.Instant;
public class Vehicle {
    private String modelName;
    private int uniqueID, length, width, modelYear;
    private Instant ArrivalTime;
    private boolean passengerType;
    public Vehicle(){}
    public Vehicle(String modelName, int uniqueID, int length, int width, int modelYear, boolean passengerType, Instant ArrivalTime)
    {
        this.modelName = modelName;
        this.uniqueID = uniqueID;
        this.width = width;
        this.length = length;
        this.modelYear = modelYear;
        this.passengerType = passengerType;
        this.ArrivalTime = ArrivalTime;
    }
    public String getModelName() {
        return modelName;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getModelYear() {
        return modelYear;
    }

    public boolean getPassengerType() {
        return passengerType;
    }

    public Instant getArrivalTime() {
        return ArrivalTime;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setPassengerType(boolean passengerType) {
        this.passengerType = passengerType;
    }

    public void setArrivalTime(Instant arrivalTime) {
        ArrivalTime = arrivalTime;
    }
    public int getArea(Vehicle vehicle)
    {
        return vehicle.getLength() * vehicle.getWidth();
    }

}
