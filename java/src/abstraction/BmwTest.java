package abstraction;

import org.junit.Test;

import junit.framework.TestCase;

public class BmwTest  extends TestCase{
	
	

	public void testAdd() {
		int expected = 30;
		int actual = BmwFlyingCar.add(10,20);
		assertEquals(expected,actual);
	}
	@Test
	public void testElgibility() {
		//boolean expected = false;
		boolean actual = BmwFlyingCar.isEligibletoVote(17);

		assertFalse(actual);
		//assertTrue(actual);
	}
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		System.out.println("I am setting up the environment for test");
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("i am tearing down the environment");
	}
	
	
}
