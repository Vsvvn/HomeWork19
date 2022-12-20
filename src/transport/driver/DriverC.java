package transport.driver;


import transport.Truck;

public class DriverC extends Driver<Truck>{


    public DriverC(String name, boolean hasDrivingLicense, int experience, String category) {
        super(name, hasDrivingLicense, experience, category);
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.finish();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель"+ getName() + " заправляет грузовой автомобиль " + transport.getBrand());

    }
}
