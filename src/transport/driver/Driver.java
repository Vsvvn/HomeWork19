package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {

    private final String name;
    private boolean hasDrivingLicense;
    private int experience;
    private String category;

    public Driver(String name, boolean hasDrivingLicense, int experience, String category) {
        this.name = name;
        this.hasDrivingLicense = hasDrivingLicense;
        this.experience = experience;
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {

        if (category == null) {
            throw new IllegalArgumentException("Укажите категорию прав водителя");
        } else {
            this.category = category;
        }
    }

    public abstract void startMove(T transport);

    public abstract void stopMove(T transport);

    public abstract void refill(T transport);

    public void driverInfo(T transport) {
        System.out.println("водитель " + name + " управляет " + transport.getBrand() + " категория прав водителя " + getCategory());
        transport.printType();
    }
}
