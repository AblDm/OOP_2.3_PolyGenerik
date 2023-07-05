import java.util.LinkedList;
import java.util.Queue;

public class Mechanist<T extends Transport> {
    private String name;

    public Mechanist(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    private String speciality;
    private Queue <T> queue = new LinkedList<> ();

    public void addTransportToServices(T car){
    queue.offer (car);
}
    public void service () {
    T car = queue.poll ();
    if (car !=null) {
        System.out.println ("Техник " + name + " проводит диагностику машины " + car);
        service();
    } else {
        System.out.println ("Все машины прошли диагностику");
    }

}
public int queueSize () {
    return queue.size ();
}
    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }
}
