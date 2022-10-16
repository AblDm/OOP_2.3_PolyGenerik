import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    public String brand;
    public String model;
    public double engineVolume;
    private final List<DriverAbstract<?>> drivers =new ArrayList<> ();
    private final List<Mechanister<?>> mechanisters =new ArrayList<> ();
    private final List<Spencer<?>> spencers =new ArrayList<> ();

    @Override
    public String toString() {
        return brand + '\'' +
                ", model='" + model + '\'' ;
    }

    protected Transport(String brand, String model, double engineVolume) {
        if (brand.isEmpty () || brand == null) {
            System.out.println ("укажите бренд");
        } else {
         this.brand= brand;}
        if (model.isEmpty ()||model==null){
            System.out.println ("укажите модель");} else {this.model = model;}
        if (engineVolume !=0){
            this.engineVolume = engineVolume;}

    }



    public boolean service() {
        System.out.println ("Автобус " + getBrand () + getModel () + " в диагностике не нуждается");
        return true;
    }

    protected abstract void start ();
    protected abstract void finish();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public void addDriver(DriverAbstract<?> drivers){
        this.drivers.addAll (Arrays.asList (drivers));

    }

    public void addMechanics(Mechanister<?>... mechanisters){
        this.mechanisters.addAll (Arrays.asList (mechanisters));
    }

    public List<DriverAbstract<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanister<?>> getMechanisters() {
        return mechanisters;
    }

    public List<Spencer<?>> getSpencers() {
        return spencers;
    }

    public void addSpencer(Spencer<?>... spencers){
        this.spencers.addAll (Arrays.asList (spencers));
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void repair() ;
}
