import java.util.*;

public class Ordenacao {
    public static void main(String[] args) {
        Aluno maria = new Aluno("Maria", "maria@gmail.com");
        Aluno joao = new Aluno("Joao", "joao@gmail.com");
        Aluno paulo = new Aluno("paulo", "paulo@gmail.com");

        List<Aluno> alunos = Arrays.asList(maria, joao, paulo);
        /*
         * alunos.sort((a1, a2) -> {
         * return a1.getNome().compareTo(a2.getNome());
         * });
         */
        alunos.subList(0, 2).forEach(System.out::println);

    }

}