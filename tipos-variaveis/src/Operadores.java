public class Operadores {
    public static void main(String[] args) {
        int numero = 10;
        String resultado;

        // Usando o operador ternário para verificar se o número é par ou ímpar
        resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número " + numero + " é " + resultado);
    }
}
