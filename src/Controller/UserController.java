package Controller;

import Model.User;
import Model.Vehicle;
import Model.Workers;

import java.time.Instant;
import java.util.*;

public class UserController {
    private List<Vehicle> cleaningQueue;
    private int numberOfWorkers = 5;
    private Queue<Workers> workers;
    private User user;
//    private final Service service = new CarCare();
    //[BM,MERC] -> clean in list[leon, FIAT]
    public String cleanIn(Queue<Vehicle> WaitingList, Vehicle vehicle, ArrayList<Workers> Workers) {
        Instant arrivalTime = Instant.now();
        vehicle.setArrivalTime(arrivalTime);
        for (int j = 0; j < Workers.size(); j++) {
            if (Workers.get(j).getAvailability()) {
                for (int i = 0; i < WaitingList.size(); i++) {
                    if (vehicle.getPassengerType()) {
                        Workers.get(j).setAvailability(false);
                        cleaningQueue.add(vehicle);
                        return ("Vehicle with Special Passenger has been worked on, Vehicle ID " + vehicle.getUniqueID());
                    }
                    else
                    {
                        if(WaitingList.size()>0){
                            cleanIn(WaitingList,WaitingList.poll(),Workers);
                        }
                    }
                }
            }
            else
            {
                WaitingList.add(vehicle);
                //we should decrease/remove the workers from the array list
                return ("Vehicle has been added to waiting list");
            }
        }
        WaitingList.add(vehicle);
        return ("Vehicle " + vehicle.getUniqueID() + " has been added to the waiting list as there is no worker currently, please wait!");
    }
    public String cleanOut(Vehicle vehicle, Workers Worker){

        cleaningQueue = new ArrayList<>();
        Worker.setAvailability(true);
        cleaningQueue.remove(vehicle);
        calculateCLeaningFees(vehicle);
        // Mark the end of the cleaning process
        return ("Cleaning finished for vehicle: " + vehicle.getUniqueID());
    }

    public String calculateCLeaningFees(Vehicle vehicle){
        // Calculate cleaning fees
        double area = vehicle.getWidth() * vehicle.getLength();
        double fees = area * 20;
        return ("Cleaning fees: " + fees + " EGP");
    }

}
