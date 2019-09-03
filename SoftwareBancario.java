package softwarebancario;

/**
 *
 * @author Priscila
 */
public class SoftwareBancario {

    public static void main(String[] args) {
       ContaCorrente c = new ContaCorrente(true);
       c.setNumeroConta(1234);
       c.setAgencia(492);
       c.setTitular("João Rodrigues");
       
       c.setSaldo(0);
       c.depositar(500);
       c.sacar(200);
       c.transferir(100);
       System.out.println(c.Dados()); 
       System.out.println("Deposito realizado na conta de " + c.getTitular()+ " no valor de " +c.getSaldo());
       System.out.println("Saque realizado na conta de " + c.getTitular()); 
    }
    
}
