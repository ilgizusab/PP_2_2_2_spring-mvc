package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private String brand;
    private int year;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(model);
        result = 31 * result + Objects.hash(brand);
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", brand=" + brand + ", year=" + year + "]";
    }
}
