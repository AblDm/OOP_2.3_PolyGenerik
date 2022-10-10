public class Car extends Transport implements Competing{

    public Car(String name, String model, double engineVolume) {
        super (name, model, engineVolume);
    }

    @Override
    public void start (){
        System.out.println ("Вставить ключ в зажигания или нажать на кнопку зажигания на брелоке" );
    }
    @Override
    public void finish(){
        System.out.println ("Заглушить мотор");
    }

    @Override
    public void pitStop() {
        System.out.println ("Приехать на заправку. ");
        finish ();
        System.out.println ("Заправить средство передвижения ");
        start ();
    }

    @Override
    public void lapTime() {
        System.out.println ("Лучшее время круга у легковой машины");
    }

    @Override
    public void maxSpeed() {
        System.out.println ("Лучшая скороть на круге у легковой машины ");
    }

}
