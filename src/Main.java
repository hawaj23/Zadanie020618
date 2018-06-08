import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(CarBrand.AUDI,"TT",CarType.HATCHBACK,9.2, 2.0,2, 200, LocalDate.of(2001,1,1),true,Drive.FOURWHEEL);
        Car car2 = new Car(CarBrand.BMW,"M3",CarType.SEDAN,15.3, 3.2,5, 420, LocalDate.of(2005,8,20),false,Drive.REAR);
        Car car3 = new Car(CarBrand.PORSCHE,"BOXSTER",CarType.CABRIO,11.1, 2.5,2, 200, LocalDate.of(2001,1,1),true,Drive.REAR);
        Car car4 = new Car(CarBrand.MAZDA,"MIATA",CarType.CABRIO,8.8, 2.0,2, 160, LocalDate.of(2005,3,3),false,Drive.REAR);
        Car car5 = new Car(CarBrand.MERCEDES,"G",CarType.SUV,18.9, 2.0,7, 550, LocalDate.of(2018,6,3),true,Drive.FOURWHEEL);
        Car car6 = new Car(CarBrand.VOLKSWAGEN,"GOLF",CarType.KOMBI,5.8, 1.6,5, 125, LocalDate.of(1998,11,30),false,Drive.FRONT);

        Offer offer1 = new Offer(car1,193.7,3.6);
        Offer offer2 = new Offer(car2,456.8,8.5);
        Offer offer3 = new Offer(car3,250.1,4.4);
        Offer offer4 = new Offer(car4,110.1,1.9);
        Offer offer5 = new Offer(car5,750.0,10.3);
        Offer offer6 = new Offer(car6,78.6,0.8);




    }
}
