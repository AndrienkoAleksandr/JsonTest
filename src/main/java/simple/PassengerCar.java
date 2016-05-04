package simple;

/**
 * //
 *
 * @author Alexander Andrienko
 */
public class PassengerCar implements Car {

    String model;
    String type;
    int amountWheels;
    int amountDoors;
    String engineInfo;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmountWheels() {
        return amountWheels;
    }

    public void setAmountWheels(int amountWheels) {
        this.amountWheels = amountWheels;
    }

    public int getAmountDoors() {
        return amountDoors;
    }

    public void setAmountDoors(int amountDoors) {
        this.amountDoors = amountDoors;
    }

    public String getEngineInfo() {
        return engineInfo;
    }

    public void setEngineInfo(String engineInfo) {
        this.engineInfo = engineInfo;
    }
}
