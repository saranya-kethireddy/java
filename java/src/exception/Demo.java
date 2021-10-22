package exception;

public class Demo {
	public static void main(String[] args) {
		int divisor = 1;
		int data = 0;
		try {
			data = 100/divisor;
			System.out.println("data is "+data);
			int a[] = new int[5];
			a[10]=50;
		}
		catch (Exception e) {
			e.printStackTrace();
			divisor++;
			data = 100/divisor;
			System.out.println("data is" +data);
		}
		System.out.println("6 million lines of code");
	}

}
