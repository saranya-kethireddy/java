package abstraction;

public class HavellsAppliances implements ISwitchBoardListener {
	
	
	@Override
	public void switchOne() {
		System.out.println("Havells fan is on");
	}

	@Override
	public int switchTwo() {
		System.out.println("Havells ac is on");
		return 28;
	}
	@Override
	public boolean switchThree() {
		System.out.println("Havells led is on");
		return false;
	}
      @Override
      public void switchFour() {
    	  System.out.println("Havells tubelight is on");
      }
}
