public class AutoMobile extends Vehicle {

    //instance vars/ attributes / class variables.
    int numberOfPassernger;

    public AutoMobile(String mn, int nw) {
        super(mn, nw);
    }

    public int getNumberOfSit(){
        return numberOfPassernger;
    }

    public void setNumberOfSit(int number){
        numberOfPassernger = number;
    }
    
}
