package streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;



public class SequenceEnumeration {
	
	public static void main(String[] args)throws IOException {
		
		FileInputStream fin=new FileInputStream("C:\\Users\\skethireddy2\\OneDrive - DXC Production\\Desktop\\fin.txt");
		FileInputStream fin1=new FileInputStream("C:\\Users\\skethireddy2\\OneDrive - DXC Production\\Desktop\\fin1.txt");
		FileInputStream fin2=new FileInputStream("C:\\Users\\skethireddy2\\OneDrive - DXC Production\\Desktop\\fin2.txt");
		Vector v = new Vector();
		v.add(fin);
		v.add(fin1);
		v.add(fin2);
		Enumeration e = v.elements();  
		SequenceInputStream bin=new SequenceInputStream(e);   
		int i=0;
		while((i=bin.read())!=-1) {
			System.out.print((char)i);   
		}
		bin.close();    
		fin.close();    
		fin2.close();    
	}

}
