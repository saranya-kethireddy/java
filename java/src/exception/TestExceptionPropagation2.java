package exception;

import java.io.IOException;

public class TestExceptionPropagation2 {
	

	
		public void m() throws IOException {
			throw new IOException();
		}

		
		public void n() throws IOException {
			m();
		}


		public void p() {

			try {
				n();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}



		public static void main(String[] args) {

			TestExceptionPropagation2 tp2 = new TestExceptionPropagation2();
			tp2.p();

		}

	}

