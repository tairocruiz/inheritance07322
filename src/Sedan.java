import vehicle.Vehicle;

public class Sedan extends AutoMobile implements Consoler {

    public Sedan(int pasNo, String mn, int nw) {
        super(pasNo, mn, nw);
    }

    public void console(Vehicle object) {
        System.out.println(object);
    }

}
