package softwarebancario;

/**
 *
 * @author Priscila
 */
public class ContaCorrente {
    protected int numeroConta;
    protected int agencia;
    protected String titular;
    protected float saldo;
    protected boolean status;

    public ContaCorrente(boolean status) {
        this.status = status;
    }

    
    public String Dados() {
        return "ContaCorrente {" + "numeroConta =" + numeroConta + ", agencia =" + agencia + ", titular =" + titular + ", saldo =" + saldo + '}';
    }
    
    
    public float sacar(float s){
        if(this.getSaldo()>s){
            this.setSaldo(this.getSaldo() - s);
            return getSaldo();
        } else {
            return getSaldo();
        }
    }
    
    public float depositar(float d){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + d);
            return getSaldo();
        } else {
            return getSaldo();
        }
    }
    
    public float transferir(float t){
        if(this.getSaldo() > t){
            this.setSaldo(this.getSaldo() - t);
            return getSaldo();
        } else {
            return getSaldo();
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
