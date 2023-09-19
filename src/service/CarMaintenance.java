package service;


import Model.Vehicle;
import Model.Workers;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CarMaintenance implements Service {

    private String carName;
    private List<Service> services;

    public CarMaintenance(String name) {
        this.carName = name;
        services = new ArrayList<>();
    }
    @Override
    public void serve(Service service) {
        services.add(service);
    }
    public List<Service> getServices() {
        return services;
    }

}
