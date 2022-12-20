package transport.driver;


import transport.Car;

public class DriverB extends Driver<Car> {


    public DriverB(String name, boolean hasDrivingLicense, int experience, String category) {
        super(name, hasDrivingLicense, experience, category);
    }

    @Override
    public void startMove(Car transport) {
        transport.start();
    }

    @Override
    public void stopMove(Car transport) {
        transport.finish();
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель"+ getName() + " заправляет легковой автомобиль " + transport.getBrand());

    }
}
