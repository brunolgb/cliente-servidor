package envios;

import java.io.*;
import java.net.*;
import java.util.*;

public class Servidor {
   
    public static void main(String args[]) throws IOException
    {
      Scanner digite = new Scanner(System.in);
      ServerSocket ss = new ServerSocket(4999);
      Socket s = ss.accept();

      System.out.println("Tem cliente conectados a este servidor!");

      PrintWriter pr2 = new PrintWriter(s.getOutputStream());

      pr2.println("Quem é você?");
      
      pr2.flush();

      InputStreamReader in = new InputStreamReader(s.getInputStream());
      BufferedReader bf = new BufferedReader(in);

      String str = bf.readLine();
      System.out.println("Nome do cliente: " + str);

      PrintWriter pr = new PrintWriter(s.getOutputStream());

      pr.println("Olá, " + str.toUpperCase());
      
      pr.flush();
    }    
}
