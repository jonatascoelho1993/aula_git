import java.util.*;

public class Main {
    static class Fornecedor {
      String nome;
      String cpfCnpj;
      String email;
      Integer dd;
      Long numeroCelular;
      List<TabelaDePreco> tabelaDePreco;

      @Override
      public String toString(){
        return "Nome: " + nome + " CPF/CNPJ: " + cpfCnpj;
      }
    }

    static class TabelaDePreco {
      Double custo;
    }

    public static void main(String[] args) {
      Fornecedor fonecedor1 = new Fornecedor();
      fonecedor1.nome = "Jonatas";
      fonecedor1.cpfCnpj = "AAA.AAA.999-99";

      System.out.println(fonecedor1);

    }
}