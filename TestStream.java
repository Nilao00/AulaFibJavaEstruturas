import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;;

public class TestStream {
    public static void main(String[] args) {
        Aluno maria = new Aluno("Maria", "maria@gmail.com", 7.0);
        Aluno maria2 = new Aluno("Maria", "maria@gmail.com", 7.0);
        Aluno joao = new Aluno("Joao", "joao@gmail.com", 4.0);
        Aluno paulo = new Aluno("paulo", "paulo@gmail.com", 10.0);

        List<Aluno> alunos = Arrays.asList(maria, joao, paulo, maria2);
        /*
         * alunos.forEach(u -> {
         * if (u.getNota() > 5) {
         * System.out.println(u);
         * }
         * });
         */

        Set<Aluno> alunosFiltrados = alunos.stream()
                .filter(u -> u.getNota() > 5.0)
                .sorted((u1, u2) -> u1.getNome().compareTo(u2.getNome()))
                .collect(toSet());

        alunosFiltrados.forEach(u -> System.out.println(u));

        Double notamaxima = alunos.stream().mapToDouble(Aluno::getNota).max().getAsDouble();
        Double notaminima = alunos.stream().mapToDouble(Aluno::getNota).min().getAsDouble();
        Double media = alunos.stream().mapToDouble(Aluno::getNota).average().getAsDouble();
        System.out.println(notamaxima);
        System.out.println(notaminima);
        System.out.println(media);
    }
}
