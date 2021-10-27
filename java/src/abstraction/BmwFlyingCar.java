package abstraction;

public class BmwFlyingCar extends FlyingCar {
    @Override
    public void stopCar() {

    }
    @Override
    public void flyCar() {
}
    @Override
    public void landCar() {

    }
    public static	int add(int a, int b) {
		return a+b;
	}

	public static boolean isEligibletoVote(int age) {
		if (age >17) {return true;}
		return false;
	}
}