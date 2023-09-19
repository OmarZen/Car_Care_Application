package service;


public class CarTires implements Service {

    private int size;

    public CarTires(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    @Override
    public void serve(Service service) {

    }
}
