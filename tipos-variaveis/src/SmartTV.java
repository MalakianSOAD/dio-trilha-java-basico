public class SmartTV {
    // Atributos
    boolean ligada;
    int canal;
    int volume;

    // Construtor
    public SmartTV() {
        this.ligada = false; // TV começa desligada
        this.canal = 1;      // Canal inicial
        this.volume = 10;    // Volume inicial
    }

    // Métodos
    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        if (ligada) {
            this.volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            this.volume--;
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            this.canal++;
        }
    }

    public void diminuirCanal() {
        if (ligada) {
            this.canal--;
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada && novoCanal > 0) {
            this.canal = novoCanal;
        }
    }
}
    

