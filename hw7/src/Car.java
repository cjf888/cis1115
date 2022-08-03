package hw7.src;

public class Car {
    public static void main(String[] args) {

    CarTester myCarTester = new CarTester(2022, "BMW");

    FuelGauge myFuelGauge = new FuelGauge(0);

    Odometer myOdometer = new Odometer(0,myFuelGauge);

    System.out.println("Current status of the car:");

    System.out.println("Year model: " + myCarTester.getYear());

    System.out.println("Make: " + myCarTester.getMakeBy());
    myFuelGauge.fillGallons();

    myOdometer.runOdometer();


    int i;

    for (i = 1; i <= 10; i++) {

        myCarTester.accelerate();

        System.out.println("\nAccelerating...");

        System.out.println("Now the speed is " + myCarTester.getSpeedOfCar());

    }

    for (i = 1; i <= 10; i++) {

        myCarTester.brake();

        System.out.println("\nBraking...");

        System.out.println("Now the speed is " + myCarTester.getSpeedOfCar());

    }
}
}

class FuelGauge {
    final int maxGallons = 15;
    private int gallons;

    public FuelGauge() {

        gallons = 0;
    }

    public FuelGauge(int gallons){
        if(gallons<=maxGallons){
            this.gallons=gallons;
            gallons=maxGallons;
        }
    }

    public int getGallons() {
        return gallons;
    }

    public void fillGallons() {

        for (gallons=1; gallons<=maxGallons-1;gallons++) {

            System.out.println("Filling Gas: " + gallons);

        }

    }

    public void burnGallons() {
        if (gallons>0){
            gallons-=1;
            System.out.println("Remaining gallons: " + gallons);
        }
        else{
            System.out.println("No More Fuel!!!");
        }
    }

}

class Odometer {

    private int mileage;
    private FuelGauge fuelGauge;

    public Odometer(int m, FuelGauge fg) {
        mileage = m;
        fuelGauge = fg;
    }

    public void runOdometer(){
        mileage = 0;
        while (fuelGauge.getGallons()>0){
            for(int i =1; i<=24;i++){
                if(mileage==999_999) {
                    mileage = 0;
                }
                mileage++;
                System.out.println("Mileage: "+ mileage);
                if (i==24) {
                    fuelGauge.burnGallons();
                }
                System.out.print("Fuel Level: " + fuelGauge.getGallons());
                }


            }
        }


    }



class CarTester {
    private int yearOfModel;

    private String makeBy;

    private int speedOfCar;

    //create new constructor accept year of model and make by
    CarTester(int y, String m) {

        yearOfModel = y;

        makeBy = m;

        speedOfCar = 0;

    }

    //create method
    public void setYear(int y) {

        yearOfModel = y;

    }

    //create method
    public void setMakeBy(String m) {

        makeBy = m;

    }

    //create method
    public void setSpeedOfCar(int s) {

        speedOfCar = s;

    }

    public int getYear() {

        return yearOfModel;

    }

    public String getMakeBy() {

        return makeBy;

    }

    public int getSpeedOfCar() {

        return speedOfCar;

    }

    public void accelerate() {

        speedOfCar += 5;

    }

    public void brake() {

        speedOfCar -= 5;

    }
}





