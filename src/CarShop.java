import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class CarShop {
    private     String name;

    List<Offer> offers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    public CarShop(String name, List<Offer> offers) {
        this.name = name;
        this.offers = offers;
    }

    public List<Offer> addOffers (Offer... offers) {
        List<Offer> offers1 = new ArrayList<>();
        for (Offer offer:offers) {
            offers1.add(offer);
        }
        return offers1;
    }

    public List<Car> getCars() {
        return offers.stream()
                .map(Offer::getCar)
                .collect(Collectors.toList());
    }

    public List<CarBrand> getCarBrands() {
        return offers.stream()
                .map(offer -> offer.getCar().getBrand())
                .collect(Collectors.toList());
    }

    public List<Car> getFourWheelDrive() {
        return offers.stream()
                .map(Offer::getCar)
                .filter(Car -> Car.getDrive().equals(Drive.FOURWHEEL))
                .collect(Collectors.toList());
    }




}
