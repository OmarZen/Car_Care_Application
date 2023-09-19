package service;


public class CarOil implements Service {
    private String type;

    public CarOil(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
    @Override
    public void serve(Service service) {

    }
}
