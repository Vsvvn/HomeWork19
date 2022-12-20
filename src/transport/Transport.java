package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand) {
        this(brand,
                "default",
                1.5);
    }

    public Transport(String brand, String model, double engineVolume) {

        if (brand == null && brand.isEmpty() && brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() && brand.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract void start();

    public abstract void finish();

    public abstract void printType();

    public abstract boolean diagnostic();

    @Override
    public String toString() {
        return "Марка " + brand +
                ", модель " + model +
                ", объем двигателя — " + engineVolume;
    }
}