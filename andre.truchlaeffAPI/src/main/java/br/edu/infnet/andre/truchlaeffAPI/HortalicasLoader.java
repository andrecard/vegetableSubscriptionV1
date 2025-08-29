package br.edu.infnet.andre.truchlaeffAPI;

import br.edu.infnet.andre.truchlaeffAPI.model.domain.Hortalicas;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HortalicasLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

            Hortalicas alface = new Hortalicas();

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
