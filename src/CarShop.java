import java.util.ArrayList;
import java.util.List;

public class CarShop {
    String name;

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
}
