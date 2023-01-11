package inter.dio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<Double> lista = new ArrayList<Double>();
        lista.add(4.5);
        lista.add(7.5);
        lista.add(8.5);
        lista.add(9.75);
        lista.add(8.5);
        lista.add(8.0);
        lista.add(8.0);
        System.out.println(lista);

        System.out.println("Posição da nota 9.75 na lista: " + lista.indexOf(9.75));
        System.out.println("Será adicionado o número 10.0 dentro da lista.");
        lista.add(7,10.0);
        System.out.println(lista);

        System.out.println("Substituindo o número 4.5 da lista.");
        lista.set(lista.indexOf(4.5),7.75 );
        System.out.println(lista);

        System.out.println("Dentro da lista, há o número 11.0? " + lista.contains(11.0));

        System.out.println("Qual o número que está na posição 3 da lista? " + lista.get(3));

        System.out.println("Qual o menor valor da lista? " + Collections.min(lista));
        System.out.println("Qual o maior valor da lista? " + Collections.max(lista));

        Iterator<Double> iterator = lista.iterator();

        Double soma = 0.0;

        while (iterator.hasNext()){
            Double next = iterator.next();

            soma =+ next;
        }

        System.out.println("Soma dos valores da lista: " + soma);

        System.out.println("Média dos valores da lista: " + soma/lista.size());

        System.out.println("Será removida a nota 7.5 da lista.");
        lista.remove(7.5);
        System.out.println(lista);

        System.out.println("Será removido o elemento da posição '3' ");
        lista.remove(3);
        System.out.println(lista);

        Iterator<Double> iterator2 = lista.iterator();

        if (iterator2.hasNext()){
            Double next = iterator2.next();
            if (next <= 8) iterator2.remove();
        }

        System.out.println(lista);

        System.out.println("Apagando lista... ");
        lista.clear();

        System.out.println("A lista está vazia? " + lista.isEmpty());
        


    }
}
