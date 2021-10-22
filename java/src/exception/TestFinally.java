package exception;

public class TestFinally {
	public static void main(String[] args) {  

		try {
			int data  =  25/0; 
			System.out.println("the data is "+data);
		} catch (Exception e) {
			
			e.printStackTrace();
		}  
		finally {
			System.out.println("finally block got executed");  

		}

	}

}
