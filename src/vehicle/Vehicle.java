package vehicle;

public abstract class Vehicle {

    int numberOfWheels;
    String manufacturer;

    public Vehicle(String mn, int nw) {
        numberOfWheels = nw;
        manufacturer = mn;
    }

    public int getNoWheels(){
        return numberOfWheels;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setNoWheels(int cnt){
        numberOfWheels = cnt;
    }

    public void serManfName(String name){
        manufacturer = name;
    }
}
