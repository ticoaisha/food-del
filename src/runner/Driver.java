package runner;

public class Driver {
    private String name;
    private String  carMake;
    private String carModel;


    public Driver(String name, String carMake, String carModel) {
        this.name = name;
        this.carMake = carMake;
        this.carModel = carModel;
    }

    public String getName() {
        return name;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", carMake='" + carMake + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
