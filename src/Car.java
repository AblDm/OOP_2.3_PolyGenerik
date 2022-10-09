public class Car extends Transport implements Competing{

    public Car(String name, String model, double engineVolume) {
        super (name, model, engineVolume);
    }

    @Override
    public void start (){
        System.out.println ("Вставить ключ в зажигания ");
    }
    @Override
    public void finish(){
        System.out.println ("Заглушить мотор");
    }

    @Override
    public void pitStop() {
        System.out.println ("Заехать в бокс ");
        System.out.println ("Заправить средство передвижения ");
    }

    @Override
    public void lapTime() {
        System.out.println ("Лучшее время круга у машины");
    }

    @Override
    public void maxSpeed() {
        System.out.println ("Лучшая скороть на круге у машины ");
    }
}
