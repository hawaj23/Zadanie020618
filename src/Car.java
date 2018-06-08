import java.time.LocalDate;

public class Car {

    private CarBrand brand;
    private String name;
    private CarType type;
    private double consumption;
    private double engineDisplacement;
    private int seats;
    private int enginePower;
    private LocalDate constructionDate;
    private boolean automatic;
    private Drive drive;

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public LocalDate getConstructionDate() {
        return constructionDate;
    }

    public void setConstructionDate(LocalDate constructionDate) {
        this.constructionDate = constructionDate;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Car(CarBrand brand, String name, CarType type, double consumption, double engineDisplacement, int seats, int enginePower, LocalDate constructionDate, boolean automatic, Drive drive) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.consumption = consumption;
        this.engineDisplacement = engineDisplacement;
        this.seats = seats;
        this.enginePower = enginePower;
        this.constructionDate = constructionDate;
        this.automatic = automatic;
        this.drive = drive;
    }
}
