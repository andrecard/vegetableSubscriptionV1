package br.edu.infnet.andre.truchlaeffAPI.model.domain;

public class Hortalicas {

   public String  nome;
   public int     numeoroDeSerie;
   public double  valor;
   public boolean ativaParaVenda;

   @Override
   public String toString() {
      return "Hortalicas{" +
              "nome='" + nome + '\'' +
              ", numeoroDeSerie=" + numeoroDeSerie +
              ", valor=" + valor +
              ", ativaParaVenda=" + ativaParaVenda +
              '}';
   }
}
