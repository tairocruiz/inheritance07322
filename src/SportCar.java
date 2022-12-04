import vehicle.Vehicle;

public class SportCar extends AutoMobile implements Consoler {

    public SportCar(int pasNo, String mn, int nw) {
        super(pasNo, mn, nw);
    }

    @Override
    public void console(Vehicle object) {
        
    }
}
