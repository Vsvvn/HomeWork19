package transport.driver;


import transport.Bus;

public class DriverD extends Driver<Bus>{

    public DriverD(String name, boolean hasDrivingLicense, int experience, String category) {
        super(name, hasDrivingLicense, experience, category);
    }

    @Override
    public void startMove(Bus transport) {
        transport.start();
    }

    @Override
    public void stopMove(Bus transport) {
        transport.finish();
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель"+ getName() + " заправляет автобус " + transport.getBrand());

    }
}
