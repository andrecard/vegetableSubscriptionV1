package br.edu.infnet.andre.truchlaeffAPI.model.domain;

public class HortalicasLoader {
    public static void main(String[] args){
        Hortalicas  alface = new Hortalicas();

        alface.nome="Alface americana";
        alface.ativaParaVenda=true;
        alface.numeoroDeSerie=23342;
        alface.valor=3.99;
        System.out.println(alface);

        Hortalicas  tomate = new Hortalicas();

        tomate.nome="Tomate cereja";
        tomate.ativaParaVenda=true;
        tomate.numeoroDeSerie=23342;
        tomate.valor=3.99;
        System.out.println(tomate);
        
    }
}
