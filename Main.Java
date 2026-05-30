import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> func1 = Arrays.asList(
            new Funcionario("Carlos",   LocalDate.of(1980, 3, 10), 2800.00, "CLT"),
            new Funcionario("Ana",      LocalDate.of(1978, 7, 22), 3000.00, "PJ"),
            new Funcionario("Beatriz",  LocalDate.of(2001, 1, 15), 2500.00, "CLT"),
            new Funcionario("Diego",    LocalDate.of(2002, 5, 20), 4200.00, "CLT"),
            new Funcionario("Eduardo",  LocalDate.of(1975, 9,  5), 2999.00, "CLT")
        );

        List<Funcionario> func2 = Arrays.asList(
            new Funcionario("Fernanda", LocalDate.of(1983, 11, 30), 1800.00, "CLT"),
            new Funcionario("Gabriel",  LocalDate.of(2000,  4, 18), 3500.00, "CLT"),
            new Funcionario("Helena",   LocalDate.of(1990,  8, 25), 5000.00, "PJ"),
            new Funcionario("Igor",     LocalDate.of(2001,  2, 11), 2200.00, "CLT"),
            new Funcionario("Julia",    LocalDate.of(1979,  6, 14), 2750.00, "CLT")
        );

        List<Empresa> empresas = Arrays.asList(
            new Empresa("TechCorp", func1),
            new Empresa("DataHub",  func2)
        );

        // ── Exercício 1 ────────────────────────────────────
        System.out.println("── Ex1: Nascidos 1975-1985 com salário <= R$3000 ──");
        StreamService.filtrarPorNascimentoESalario(empresas)
                     .forEach(System.out::println);

        // ── Exercício 2 ────────────────────────────────────
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("\n── Ex2: Soma dos pares ────────────────────────────");
        System.out.println("  Resultado: " + StreamService.somarPares(numeros));

        // ── Exercício 3 ────────────────────────────────────
        System.out.println("\n── Ex3: 30 maiores salários CLT < 25 anos ─────────");
        StreamService.maioresSalariosJovens(empresas)
                     .forEach(System.out::println);
    }
}
