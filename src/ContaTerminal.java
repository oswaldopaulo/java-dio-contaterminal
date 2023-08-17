public class ContaTerminal {
    private int numero;
    private String agencia, nome;
    private float saldo;

    public ContaTerminal(int numero, String agencia, String nome, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaTerminal{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }
}
