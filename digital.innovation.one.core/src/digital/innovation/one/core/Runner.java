package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;
//import digital.innovation.one.utils.internal.SumHelper; não funciona não está disponível
import java.util.ArrayList;
import java.sql.*; //Funciona pq foi chamado no module-info

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.div(15, 3));
//        SumHelper //Error
        ArrayList<String> lista;

    }
}
