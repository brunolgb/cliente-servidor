package envios;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClienteTCP {
   
    public static void main(String args[]) throws IOException
    {

    	Scanner digite = new Scanner(System.in);
    	Socket s = new Socket("localhost",4999);


    	InputStreamReader in2 = new InputStreamReader(s.getInputStream());
	    BufferedReader bf2 = new BufferedReader(in2);

      	String str2 = bf2.readLine();
      	System.out.println("Servidor: " + str2);


    	PrintWriter pr = new PrintWriter(s.getOutputStream());
    	String dadosRec = digite.nextLine();
    	pr.println(dadosRec);
    	pr.flush();

    	InputStreamReader in = new InputStreamReader(s.getInputStream());
	    BufferedReader bf = new BufferedReader(in);

      	String str = bf.readLine();
      	System.out.println("Servidor: " + str);
    }    
}
