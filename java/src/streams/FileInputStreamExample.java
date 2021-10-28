package streams;

import java.io.FileInputStream;

public class FileInputStreamExample {
	
	public static void main(String args[]){    
        try{    
          FileInputStream fin=new FileInputStream("C:\\Users\\skethireddy2\\OneDrive - DXC Production\\Desktop\\testin.txt");    
          int i=fin.read();  
          System.out.print((char)i);    

          fin.close();    
        }catch(Exception e){System.out.println(e);}    
       }    
      }  

