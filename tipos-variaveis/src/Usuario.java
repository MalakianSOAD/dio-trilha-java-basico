public class Usuario {
    public static void main(String[] args) {
        // Criando uma instância da SmartTV
        SmartTV minhaTV = new SmartTV();

        // Operando a TV
        minhaTV.ligar();
        minhaTV.aumentarVolume();
        minhaTV.mudarCanal(5);
        minhaTV.diminuirCanal();

        // Exibindo o estado atual da TV
        System.out.println("TV ligada: " + minhaTV.ligada);
        System.out.println("Canal atual: " + minhaTV.canal);
        System.out.println("Volume atual: " + minhaTV.volume);

        minhaTV.desligar();
    }
}
