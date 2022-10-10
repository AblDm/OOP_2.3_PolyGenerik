public abstract class Transport {
    public String brand;
    public String model;
     public double engineVolume;

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

    protected abstract void start ();
    protected abstract void finish();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
