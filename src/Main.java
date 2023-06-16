import entidades.*;
import enums.Sexo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        ConstrutorCsv construtorCsv = new ConstrutorCsv();

        pessoas.add(new Pessoa(Long.valueOf(1),"Joao da Silva", "111.235.444-99", LocalDate.of(1984,6,30), Sexo.M,
                new Endereco("Rua XV de Novembro", 50, "sem complemento", "Jardim das Belezas", "Sao Paulo", "SP"),
                new Contato("joao.silva@gmail.com", Long.valueOf("11996515589"), Long.valueOf("1122056904"), true),
                new DadosProfissionais("Desenvolvedor", "MJV", 5000.00, true),
                new PretencaoSalarial(6000.00, 10000.00),
                new Habilidades(List.of("Java", "Angular", "SQL"))));

        pessoas.add(new Pessoa(Long.valueOf(2),"Maria Fernandes", "456.248.548-19", LocalDate.of(1990,12,10), Sexo.F,
                new Endereco("Rua Pernambuco", 66, "Ap 123", "Paulista", "Rio de Janeiro", "RJ"),
                new Contato("maria.fernandes@gmail.com", Long.valueOf("21965415501"), Long.valueOf("2122568441"), true),
                new DadosProfissionais("Desenvolvedora", "MJV", 7000.00, true),
                new PretencaoSalarial(8000.00, 16000.00),
                new Habilidades(List.of("Java", "Angular", "SQL", "C#", "NoSQL", "Power BI", "Tableau", "Spring Boot", "Maven", "MySQL"))));

        construtorCsv.construirCsv(pessoas);
    }
}