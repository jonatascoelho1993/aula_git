import java.util.*;

public class Main {
   static class Fornecedor {
      String nome;
      String cpfCnpj;
      String email;
      Integer dd;
      Long numeroCelular;
      List<TabelaDePreco> tabelaDePreco;

    }


      @Override
      public String toString(){
        return "Nome: " + nome + " CPF/CNPJ: " + cpfCnpj;
      }
    
    static class TabelaDePreco {
      String produto;
      Double custo;
    }

    static class Produto {
      String descricao;
    }

    static class PedidoCompra {
      Fornecedor fornecedor;
      List<itens> Intem;
      Double totalReal;
      Double totalQuantidade;

    }

    static class Intem {
      Produto produto;
      TabelaDePreco preco;
      Double quantidade;
      Double total;

    }

    public static void main(String[] args) {
      Fornecedor fonecedor1 = new Fornecedor();
      fonecedor1.nome = "Jonatas";
      fonecedor1.cpfCnpj = "AAA.AAA.999-99";

      System.out.println(fonecedor1);

      String email1 = "jonatascoelho21@gmail.com";
