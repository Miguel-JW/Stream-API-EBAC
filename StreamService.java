import java.util.List;
import java.util.stream.Collectors;

public class StreamService {

    // ── Exercício 1: funcionários nascidos entre 1975 e 1985 com salário <= 3000
    public static List<Funcionario> filtrarPorNascimentoESalario(List<Empresa> empresas) {
        return empresas.stream()
            .flatMap(e -> e.getFuncionarios().stream())
            .filter(f -> f.getDataNascimento().getYear() >= 1975
                      && f.getDataNascimento().getYear() <= 1985)
            .filter(f -> f.getSalario() <= 3000.00)
            .collect(Collectors.toList());
    }

    // ── Exercício 2: soma dos números pares de uma lista
    public static int somarPares(List<Integer> numeros) {
        return numeros.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();
    }

    // ── Exercício 3: 30 maiores salários de CLT com menos de 25 anos
    public static List<Funcionario> maioresSalariosJovens(List<Empresa> empresas) {
        return empresas.stream()
            .flatMap(e -> e.getFuncionarios().stream())
            .filter(f -> f.getTipoContrato().equalsIgnoreCase("CLT"))
            .filter(f -> f.getIdade() < 25)
            .sorted((a, b) -> Double.compare(b.getSalario(), a.getSalario()))
            .limit(30)
            .collect(Collectors.toList());
    }
}
