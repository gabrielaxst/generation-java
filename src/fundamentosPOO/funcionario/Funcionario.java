package fundamentosPOO.funcionario;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int idFuncionario;
    private int tempoDeEmpresa;

    public Funcionario(String nome, String cargo, double salario, int idFuncionario, int tempoDeEmpresa) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idFuncionario = idFuncionario;
        this.tempoDeEmpresa = tempoDeEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getTempoDeEmpresa() {
        return tempoDeEmpresa;
    }

    public void setTempoDeEmpresa(int tempoDeEmpresa) {
        this.tempoDeEmpresa = tempoDeEmpresa;
    }
    public String visualizar() {
        return String.format("\tDados dos funcionários ->\nNome: %s\nCargo: %s\nSalário: R$%.2f\nId: %d\nTempo de empresa: %d anos",
                getNome(), getCargo(), getSalario(), getIdFuncionario(), getTempoDeEmpresa());
    }
}
