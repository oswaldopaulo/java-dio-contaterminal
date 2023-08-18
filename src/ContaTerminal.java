import java.util.Scanner;
public class ContaTerminal {
    private int numero;
    private String agencia, nome;
    private float saldo;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        System.out.println("Por favor, digite o número da Agência !");
        conta.setAgencia(scanner.next());

        System.out.println("Por favor, digite o número da Conta !");
        conta.setAgencia(scanner.next());

        System.out.println("Por favor, digite o número da Conta !");
        conta.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite o nome !");
        conta.setNome(scanner.next());

        System.out.println("Por favor, digite o saldo !");
        conta.setSaldo(scanner.nextFloat());


        System.out.println("Olá " + conta.getNome() +", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() +", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");


    }

    public ContaTerminal() {

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(float saldo) {
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
