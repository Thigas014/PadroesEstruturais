package Bridge;

public class Radio implements Dispositivo {
    private boolean ligado = false;
    private int volume = 5;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Rádio ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Rádio desligado.");
    }

    @Override
    public void aumentarVolume() {
        if (ligado) {
            volume++;
            System.out.println("Volume do Rádio aumentado para: " + volume);
        } else {
            System.out.println("Rádio está desligado. Não é possível ajustar o volume.");
        }
    }

    @Override
    public void diminuirVolume() {
        if (ligado) {
            volume--;
            System.out.println("Volume do Rádio diminuído para: " + volume);
        } else {
            System.out.println("Rádio está desligado. Não é possível ajustar o volume.");
        }
    }
}

