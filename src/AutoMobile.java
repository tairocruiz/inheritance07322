import vehicle.Vehicle;

public class AutoMobile extends Vehicle {

    //instance vars/ attributes / class variables.
    int numberOfPassernger;

    public AutoMobile(int pasNo, String mn, int nw) {
        super(mn, nw);
        numberOfPassernger = pasNo;
    }

    public int getNumberOfSit(){
        return numberOfPassernger;
    }

    public void setNumberOfSit(int number){
        numberOfPassernger = number;
    }
    
}
