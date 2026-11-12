
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Pessoa> pessoas = new HashSet<>();

        // Cadastro das pessoas
        pessoas.add(new Pessoa("Lucas", 23));
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("Mariana", 30));

        // Adicionando pessoas repetidas
        pessoas.add(new Pessoa("Lucas", 23));
        pessoas.add(new Pessoa("Ana", 25));

        // Mesmo nome, mas idade diferente
        pessoas.add(new Pessoa("Ana", 26));

        // Exibindo a quantidade de pessoas
        System.out.println("Quantidade de pessoas: "
                + pessoas.size());

        // Listando todas as pessoas
        System.out.println("\nPessoas cadastradas:");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        Pessoa pessoa1 = new Pessoa("Lucas", 23);
        Pessoa pessoa2 = new Pessoa("Lucas", 23);

        System.out.println("Comparação com ==: "
                + (pessoa1 == pessoa2));

        System.out.println("Comparação com equals(): "
                + pessoa1.equals(pessoa2));

    }
}
