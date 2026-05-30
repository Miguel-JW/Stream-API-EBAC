import java.time.LocalDate;

public class Funcionario {
    private String    nome;
    private LocalDate dataNascimento;
    private double    salario;
    private String    tipoContrato; // "CLT" ou "PJ"

    public Funcionario(String nome, LocalDate dataNascimento, double salario, String tipoContrato) {
        this.nome           = nome;
        this.dataNascimento = dataNascimento;
        this.salario        = salario;
        this.tipoContrato   = tipoContrato;
    }

    public String    getNome()           { return nome; }
    public LocalDate getDataNascimento() { return dataNascimento; }
    public double    getSalario()        { return salario; }
    public String    getTipoContrato()   { return tipoContrato; }

    public int getIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    @Override
    public String toString() {
        return String.format("  %-15s | Nasc: %s | Salário: R$ %8.2f | %s",
            nome, dataNascimento, salario, tipoContrato);
    }
}
