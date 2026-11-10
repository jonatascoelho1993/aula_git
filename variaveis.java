import java.util.*;

public class Main {
    public static void main(String[] args) {

      System.out.println("------------Primitivos------------");
      
      //primitivos
      boolean teste = false;  //ou true

      boolean logico1 = 1 == 1; //igual
      boolean logico2 = 1 != 1; // diferente

      System.out.println(teste);
      System.out.println(logico1);
      System.out.println(logico2);

      byte numero1 = -128 ; //-128 até 127
      short numero2 = 4000 / 4 ; //-32.768 até 32.767 
      int numero3 = 50000 + 50000;// - 2.147.483.648 ate 2.147.483.647  
      long numero4 = 100000 * 1000; 
      float flutuante1 = 13.6f; 
      double flutuante2 = 5.56;
      float flutuante3 = 10f/4f; 
      double flutuante4 = 5.25 * 1.25;
      char umCaracter = 'T';

      System.out.println(numero1);
      System.out.println(numero2);
      System.out.println(numero3);
      System.out.println(numero4);
      System.out.println(flutuante1);
      System.out.println(flutuante2);
      System.out.println(flutuante3);
      System.out.println(flutuante4);
      System.out.println(umCaracter);

      System.out.println("------------Wrappers------------");

      String texto = "Ola mundo";
      Character caracter2 = 'A';
      Boolean logico3 = false;
      Boolean logico4 = 5 == 5;

      System.out.println(texto);
      System.out.println(logico3);
      System.out.println(logico4);

      Long numero5 = new Long(15000);
      Long numero6 = 15000l;
      Integer numero7 = 1500;

      Float flutuante6 = 44.7f;
      Double flutuante7 = 45.66;

      System.out.println(numero5);
      System.out.println(numero6);
      System.out.println(numero7);
      System.out.println(flutuante6);
      System.out.println(flutuante7);
      
    }
}