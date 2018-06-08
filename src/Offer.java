public class Offer {
    private Car car;
    private Double price;
    private Double rent;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public Offer(Car car, Double price, Double rent) {
        this.car = car;
        this.price = price;
        this.rent = rent;
    }
}
