package inter.dio;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Nota 5 está no conjunto? " + notas.contains(5d));

        System.out.println("Menos nota: " + Collections.min(notas));
        System.out.println("Maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double totalDeNotas = iterator.next();
            soma += totalDeNotas;
        }

        System.out.println("Soma das notas: " + soma );

        System.out.println("Média: " + soma/ notas.size());

        notas.remove(0d);

        System.out.println(notas);





    }
}
