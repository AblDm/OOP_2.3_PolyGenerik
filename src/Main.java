import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println ("Hello world!");


        Mechanister<Car> petr = new Mechanister<Car> ("Петр", "Механический", "Луцк");
        Mechanister<Transport> aleksey = new Mechanister<Transport> ("Петр", "Механический", "Луцк");
        Spencer<Transport> lukoil = new Spencer<> ("Лукойл", 20000);
        Spencer<Transport> michelin = new Spencer<> ("Michelin", 20000);


        Car car = new Car ("Мерседес", "ML", 10);
        car.addDriver (new DriverB ("Анатолий С.", true, 2, car, TypeOfBody.HATCHBACK));
        car.addMechanics (petr);
        car.addSpencer (lukoil, michelin);

        Car car1 = new Car ("Тайота", "Крузак", 20);
        car1.addDriver (new DriverB ("Роман Д", true, 2, car1, TypeOfBody.HATCHBACK));
        Car car2 = new Car ("Лада", "Калина", 30);
        car2.addDriver (new DriverB ("Степан В.", true, 2, car2, TypeOfBody.HATCHBACK));
        Car car3 = new Car ("Автомобиль", "с поля чудес", 40);
        car3.addDriver (new DriverB ("Арсений Н.", true, 2, car3, TypeOfBody.HATCHBACK));

        Truck truck = new Truck ("Грузовик 1", "Камаз", 10);
        truck.addDriver (new DriverD ("Борис С.", true, 2, truck, TypeOfWeight.N1));
        truck.addMechanics (aleksey);
        truck.addSpencer (lukoil, michelin);


        Truck truck1 = new Truck ("Грузовик 2", "DAF", 10);
        Truck truck2 = new Truck ("Грузовик 3", "Iveco", 10);
        Truck truck3 = new Truck ("Грузовик 4", "MEN", 10);


        Bus bus = new Bus ("Икарус", " 250", 120);
        bus.addDriver (new DriverC ("Борис С.", true, 2, bus, TypeOfCapacity.ESPECIALLY_BIG));
        bus.addMechanics (aleksey);
        bus.addSpencer (lukoil, michelin);
        Bus bus1 = new Bus ("Котобус", " Кот-автобус", 160);
        Bus bus2 = new Bus (" ЛиАз", " 4249", 150);
        Bus bus3 = new Bus ("ВолгаБас", " 4276", 150);


        DriverB roman = new DriverB ("Роман", true, 2, car, TypeOfBody.HATCHBACK);
        DriverD larisa = new DriverD ("Лариса", true, 2, truck, TypeOfWeight.N3);

        DriverC stanislav = new DriverC ("Роман", true, 2, bus1, TypeOfCapacity.ESPECIALLY_SMALL);
        System.out.println (stanislav);
        stanislav.startMove (bus1);
        stanislav.refill (bus1);

        service (truck, car, bus);
        Mechanist<Car> pasha = new Mechanist<Car> ("Паша", "Техник");
        pasha.addTransportToServices (car);
        pasha.addTransportToServices (car1);
        pasha.addTransportToServices (car2);
        pasha.service ();


        Set<Transport> transports = new HashSet<Transport>();
                transports.add (truck);
                transports.add (car);
                transports.add (bus);

        ServiceStation serviceStation = new ServiceStation ();
        serviceStation.addCar (car);
        serviceStation.addTruck (truck);
        serviceStation.service ();
        serviceStation.service ();



        for (Transport transport : transports){
            printInfo (transport);
        }


    }
    private static void printInfo (Transport transport){
        System.out.println ("Информация по автомобилю: " +
                transport.getBrand () + transport.getModel ());
        System.out.println ("Водители: ");
        for (DriverAbstract<?> driver: transport.getDrivers ()){
            System.out.println (driver.fullName);
        }
        System.out.println ("Cпонсоры: ");
        for (Spencer<?> spencer: transport.getSpencers ()){
            System.out.println (spencer.getName ());
        }
        System.out.println ("Механики: ");
        for (Mechanister<?> mechanister : transport.getMechanisters ()){
            System.out.println (mechanister.getName ()+" " + mechanister.getSurname () +" из " + mechanister.getCompany () );
        }


    }


    private static void service (Transport... transports){
        for (Transport transport : transports) {
            serviceTransport (transport);
        }
    }
    private static void serviceTransport (Transport transport) {
        try {
            if (!transport.service ()) {
                throw new RuntimeException ("AVTO " + transport.getBrand () + " " + transport.getModel () + " не прошёл диагностику");
            }
        } catch (RuntimeException e)
        {
            System.out.println (e.getMessage ());
        }


    }



}