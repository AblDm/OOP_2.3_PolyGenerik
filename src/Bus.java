public class Bus extends Transport implements Competing {
    public Bus(String name, String model, double engineVolume) {
        super (name, model, engineVolume);
    }

    @Override
    public void start (){
        System.out.println ("Вставить ключ в зажигания из " + getBrand ());
    }
    @Override
    public void finish(){
        System.out.println ("Заглушить мотор");
    }

    @Override
    public void pitStop() {
        System.out.println ("Заехать в бокс ");
        finish ();
        System.out.println ("Заправить Автобус дизельным топливом");
        // start ();
    }

    @Override
    public void lapTime() {
        System.out.println ("Лучшее время круга у машины");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public void maxSpeed() {
        System.out.println ("Лучшая скороть на круге у машины ");
    }
}
