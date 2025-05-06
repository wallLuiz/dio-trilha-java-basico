public abstract class Conta implements IConta {
 private static final int AGENCIA_PADRAO = 1;
 private static int SEQUENCIAL = 1;

 protected int agencia;
 protected int numero;
 protected double saldo;
 protected Cliente cliente;

 public Conta(Cliente cliente) {
     this.agencia = AGENCIA_PADRAO;
     this.numero = SEQUENCIAL++;
     this.cliente = cliente;
 }

 @Override
 public void sacar(double valor) {
     saldo -= valor;
 }

 @Override
 public void depositar(double valor) {
     saldo += valor;
 }

 @Override
 public void transferir(double valor, IConta contaDestino) {
     this.sacar(valor);
     contaDestino.depositar(valor);
 }

 protected void imprimirInfosComuns() {
     System.out.println("Titular: " + cliente.getNome());
     System.out.println("Agência: " + agencia);
     System.out.println("Número: " + numero);
     System.out.println("Saldo: " + saldo);
 }
}
