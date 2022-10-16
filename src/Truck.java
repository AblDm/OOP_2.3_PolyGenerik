public class Truck extends Transport implements Competing {


    public Truck (String name, String model, double engineVolume) {
        super (name, model, engineVolume);
    }

    @Override
    public void start (){
        System.out.println ("Вставить ключ в Грузовой автомобиль, включить трекер ");
    }
    @Override
    public void finish(){
        System.out.println ("Заглушить мотор, выключить трекер");
    }

    @Override
    public void pitStop() {
        System.out.println ("Заехать в бокс ");

        System.out.println ("Заправить средство передвижения ");

    }
    @Override
    public boolean service() {
        return Math.random ()>0.75;
    }
    @Override
    public void lapTime() {
        System.out.println ("Лучшее время круга у машины");
    }

    @Override
    public void maxSpeed() {
        System.out.println ("Лучшая скороть на круге у машины ");
    }
    @Override
    public void repair() {
        System.out.println ("Грузовик " + getBrand () + getModel () + " починен");
    }
}
