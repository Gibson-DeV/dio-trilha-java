package inter.dio;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class OrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Breve história", 200));
            put("Charles", new Livro("O poder do hábito", 192));
            put("Harari", new Livro("O segredo", 157));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey()+ " -- " + livro.getValue().getNome());
        }

        System.out.println("Ordem de inserção: ");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Robert Green", new Livro("As 48 leis do poder", 455));
            put("Lucas", new Livro("Leis", 405));
            put("Pedro", new Livro("Poder", 165));
        }};

        for (Map.Entry<String, Livro> livro2 : meusLivros2.entrySet())
              {
                  System.out.println(livro2.getKey()+ "---" + livro2.getValue().getNome());


        }


    }

}


class Livro {
    private String nome;
    private int paginas;

    public Livro(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return paginas == livro.paginas && Objects.equals(nome, livro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}