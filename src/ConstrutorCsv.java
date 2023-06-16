import entidades.Pessoa;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ConstrutorCsv {
    public void construirCsv(List<Pessoa> pessoas) {

        try {
            StringBuilder conteudo = new StringBuilder();

            for (Pessoa pessoa : pessoas) {
                conteudo.append(pessoa.getNome() + ";");
                conteudo.append(pessoa.getCpf() + ";");
                conteudo.append(pessoa.getDataNascimento() + ";");
                conteudo.append(pessoa.getSexo() + ";");
                conteudo.append(pessoa.getEndereco().getLogradouro() + ";");
                conteudo.append(pessoa.getEndereco().getNumero() + ";");
                conteudo.append(pessoa.getEndereco().getComplemento() + ";");
                conteudo.append(pessoa.getEndereco().getBairro() + ";");
                conteudo.append(pessoa.getEndereco().getCidade() + ";");
                conteudo.append(pessoa.getEndereco().getEstado() + ";");
                conteudo.append(pessoa.getContato().getEmail() + ";");
                conteudo.append(pessoa.getContato().getCelular() + ";");
                conteudo.append(pessoa.getContato().getTelefone() + ";");
                conteudo.append(pessoa.getContato().isSeWhatsApp() + ";");
                conteudo.append(pessoa.getDadosProfissionais().getEmpresa() + ";");
                conteudo.append(pessoa.getDadosProfissionais().getProfissao() + ";");
                conteudo.append(pessoa.getDadosProfissionais().getSalario() + ";");
                conteudo.append(pessoa.getDadosProfissionais().getEmpregoAtual() + ";");
                conteudo.append(pessoa.getPretencaoSalarial().getPretencaoMinima() + ";");
                conteudo.append(pessoa.getPretencaoSalarial().getPretencaoMaxima() + ";");
                conteudo.append(pessoa.getHabilidades().getHabilidades() + ";");
                conteudo.append(System.lineSeparator());
            }
            System.out.println(conteudo);

            Path arquivoDestino = Paths.get("atividade_cadastro.csv");

            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
