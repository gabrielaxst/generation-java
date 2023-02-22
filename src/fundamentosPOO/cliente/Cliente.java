package fundamentosPOO.cliente;

public class Cliente {
    private String nome;
    private String cidade;
    private String estado;
    private int idade;
    private double saldo;

    public Cliente(String nome, String cidade, String estado, int idade, double saldo) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.idade = idade;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String visualizar() {
        return String.format("\tDados do cliente da Loja\nNome: %s\nCidade: %s\nEstado %s\nIdade: %d\nSaldo: R$%.2f",
                getNome(), getCidade(), getEstado(), getIdade(), getSaldo());
    }
}
