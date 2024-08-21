public class Conta {
    // variavel da classe conta
    double saldo = 10.0;
    double novoSaldo;
    
    public void sacar (Double valor) {
        // vari avel local de método
         novoSaldo = saldo - valor;
}
public void imprimirSaldo(){
   //disponível em toda classe 
   System.out.println(saldo);

   System.out.println(novoSaldo);
}

    
}
