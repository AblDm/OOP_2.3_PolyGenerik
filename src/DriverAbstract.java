public abstract class DriverAbstract <T extends Transport& Competing> {

    public String fullName;

     private boolean licenseIsOK;
        double stage;

    private T car;

    public DriverAbstract(String fullName, boolean licenseIsOK, int stage, T car) {

        if (fullName == null || fullName.isEmpty ()) {
            System.out.println ("Укажите ФИО водителя");
        } else { this.fullName = fullName;}
        if (!licenseIsOK){
            throw new NullPointerException ("Нет прав, получить до гонки");}
        else {this.licenseIsOK = licenseIsOK;}
        if (car != null){
        this.car = car;}
        setStage (stage);
    }

    public void startMove (){
        System.out.println ((fullName + " заводит " + car.getBrand () + " " + car.getModel ()));
    }
    public void stopMove(){
        System.out.println ((fullName + " останавливает " + car.getBrand () + " " + car.getModel ()));
    }
    public void refill (){
        System.out.println ((fullName + " заправляет " + car.getBrand () + " " + car.getModel ()));
    };



    public void setStage(double stage) {
        if (stage <=0){
            System.out.println ("Нужно больше стажа вождения.");
        }
        else {this.stage = stage;}
    }
    //водитель А управляет автомобилем Б и будет участвовать в заезде
    @Override
    public String toString() {
        return
                "Водитель [" + fullName  +
                "] управляет транспортным средстваом [" + car +
                "] и будет участвовать в заезде";
    }
}
