package inter.dio;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("Carros e seus respectivos modelos: ");
        Map<String, Double> carros = new HashMap<>(){{
           put("Gol", 14.4);
           put("Civic", 10.4);
           put("Focus", 7.5);
           put("Tucson", 9.0);
           put("Elantra", 8.7);
        }};
        System.out.println(carros);

        System.out.println("Substituir o consumo do gol por 15.2 km/l: ");
        carros.put("Gol",15.2);
        System.out.println(carros);

        System.out.println("Saber se o modelo Tucson exite no dicionário: " + carros.containsKey("Tucson"));
        System.out.println("Saber se o modelo Fiesta exite no dicionário: " + carros.containsKey("Fiesta"));

        System.out.println("Consumo do Focus: " + carros.get("Focus"));

        System.out.println("Modelo menos economico: ");

        Double consumoMenosEficiente = Collections.min(carros.values());
        System.out.println(consumoMenosEficiente);

        System.out.println("Apague o dicionario");
        carros.clear();

        System.out.println("A lista está vazia? " + carros.isEmpty());




    }

}
