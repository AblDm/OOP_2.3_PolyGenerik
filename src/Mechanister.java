public class Mechanister <T extends Transport> {
    private final String name;
    private final String surname;
    private final String company;

    public Mechanister(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean service (T car) {
        return car.service ();

    }


    public void repair (T car){
        car.repair ();
    }
}
