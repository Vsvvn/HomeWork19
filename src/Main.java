import transport.*;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {

    public static void separator() {
        System.out.println("========================");
    }

    public static void separator1() {
        System.out.println();
    }

    public static void main(String[] args) {


        Bus volgaBus = new Bus("VolgaBus", "Ситиритм 12 GLF", 6.87, Capacity.LARGE);
        System.out.println(volgaBus);

        Bus liaz = new Bus("Лиаз", "ЛИАЗ-5292 РЕСТАЙЛИНГ", 6.871, Capacity.AVERAGE);
        System.out.println(liaz);

        Bus kavz = new Bus("КАВЗ", "КАВЗ-4270", 6.7, Capacity.SMALL);
        System.out.println(kavz);

        Bus paz = new Bus("ПАЗ", "ВЕКТОР NEXT", 6.7, Capacity.SMALL);
        System.out.println(paz);


        Driver<Bus> vasya = new DriverD("Василий", true, 10, "D");

        separator1();
        vasya.driverInfo(volgaBus);
        separator1();

        volgaBus.pitStop();
        volgaBus.bestLapTime();
        volgaBus.maxSpeed();
        separator();
        separator1();

        Car kia = new Car("Kia", "Kia Sportage 4-го поколения", 2.4, BodyType.SEDAN);
        System.out.println(kia);

        Car lada = new Car("Lada", "Lada Granta", -1.7, BodyType.SEDAN);
        System.out.println(lada);

        Car audi = new Car("Audi", "Audi A8 50 L TDI quattro", 3.0, BodyType.SEDAN);
        System.out.println(audi);

        Car hyundai = new Car("Hyundai", "Hyundai Avante", 1.6, BodyType.SEDAN);
        System.out.println(hyundai);


        Driver<Car> alex = new DriverB("Александр", true, 10, "B");

        separator1();
        alex.driverInfo(lada);
        separator1();

        lada.pitStop();
        lada.bestLapTime();
        lada.maxSpeed();
        separator();
        separator1();

        Truck ural = new Truck("УРАЛ", "УРАЛ NEXT44202-5311", 6.65, CargoCapacity.N2);
        System.out.println(ural);

        Truck kamaz = new Truck("КАМАЗ", "KAMAZ-5490", 6.65, CargoCapacity.N2);
        System.out.println(kamaz);

        Truck gaz = new Truck("ГАЗ", "Валдай NEXT", 2.8, CargoCapacity.N1);
        System.out.println(gaz);

        Truck tonar = new Truck("Тонар", "Тонар-7507", 15, CargoCapacity.N3);
        System.out.println(tonar);


        Driver<Truck> petr = new DriverC("Петр", true, 10, "D");

        separator1();
        petr.driverInfo(kamaz);
        separator1();

        kamaz.pitStop();
        kamaz.bestLapTime();
        kamaz.maxSpeed();
        separator();


        service(kamaz, ural, lada, volgaBus);
        separator();
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.diagnostic()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}