import java.util.*;

public class Main {
    public static void main(String[] args) {
      Integer[] listaDeNotas;

      listaDeNotas = new Integer[4]; //[0, 1, 2, 3]
      listaDeNotas[0] = 9;
      listaDeNotas[1] = 10;
      listaDeNotas[3] = 7;

      Integer[] listaDeNotas2 = {9, 8, 10, 7, 6};
      listaDeNotas2[4] = 10;

      Integer somaNotas = 0;

      for(int i = 0; i < listaDeNotas2.length; i++){  // i++ igual i += 1 igual i = i + 1
        System.out.println("Posicao " + i + " : " + listaDeNotas2[i]);
        somaNotas = somaNotas + listaDeNotas2[i];
      }

      for(Integer nota : listaDeNotas){
        System.out.println(nota);
      }

      System.out.println(somaNotas);

      if(somaNotas/listaDeNotas2.length > 8){
        System.out.println("Aluno aprovado, média : " +  somaNotas/listaDeNotas2.length);
      }

      Double saldo = 205.5;
      Double valorSaque = 201.0;

      if(saldo > valorSaque){
        System.out.println("Saque efetivado");
      } else {
        System.out.println("Saldo insuficiente");
      }
      
    }
}