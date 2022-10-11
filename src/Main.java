public class Main {
    public static void main(String[] args) {
        System.out.println ("Hello world!");

        Bus bus =new Bus("Икарус", " 250",120);
        Bus bus1=new Bus("Котобус", " Кот-автобус",160);
        Bus bus2=new Bus(" ЛиАз", " 4249",150);
        Bus bus3=new Bus("ВолгаБас", " 4276",150);

        Car car  = new Car ("Мерседес", "Мерседес", 10);
        Car car1 = new Car ("Тайота", "Тайота", 20);
        Car car2 = new Car ("Лада", "Калина", 30);
        Car car3 = new Car ("Автомобиль", "с поля чудес", 40);

        Truck truck = new Truck ("Грузовик 1", "Камаз", 10);
        Truck truck1 = new Truck ("Грузовик 2", "DAF", 10);
        Truck truck2 = new Truck ("Грузовик 3", "Iveco", 10);
        Truck truck3 = new Truck ("Грузовик 4", "MEN", 10);

        DriverB roman = new DriverB ("Роман",true,2, car, TypeOfBody.HATCHBACK);
        DriverD larisa = new DriverD ("Лариса",true,2, truck, TypeOfWeight.N3);

        DriverC stanislav = new DriverC ("Роман",true,2, bus1, TypeOfCapacity.ESPECIALLY_SMALL);
        System.out.println (stanislav);
        stanislav.startMove ();
        stanislav.refill ();




    }
}