package com.senai.singleton;

import com.senai.singleton.entidades.Carro;
import com.senai.singleton.entidades.Singleton;
import com.senai.singleton.entidades.Teste;
import javafx.application.Application;

import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) {
     //   Application.launch(HelloApplication.class, args);

        Carro c1 = new Carro("Prata", "Civic Ex Manual Vtec", "Honda", "1999");
        Carro c2 = new Carro("Preto", "VW Beatle TSI EA888", "Volkswagen", "2014");
        Carro c3 = new Carro("Laranja", "787B", "Mazda", "1979");

        Singleton.getInstancia().carros.add(c1);
        Singleton.getInstancia().carros.add(c2);
        Singleton.getInstancia().carros.add(c3);



        Teste teste = new Teste();
        teste.testar();

    }

}
