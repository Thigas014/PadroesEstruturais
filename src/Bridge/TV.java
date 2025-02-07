package Bridge;

public class TV implements Dispositivo {
    private boolean ligado = false;
    private int volume = 10;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("TV ligada.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("TV desligada.");
    }

    @Override
    public void aumentarVolume() {
        if (ligado) {
            volume++;
            System.out.println("Volume da TV aumentado para: " + volume);
        } else {
            System.out.println("TV está desligada. Não é possível ajustar o volume.");
        }
    }

    @Override
    public void diminuirVolume() {
        if (ligado) {
            volume--;
            System.out.println("Volume da TV diminuído para: " + volume);
        } else {
            System.out.println("TV está desligada. Não é possível ajustar o volume.");
        }
    }
}

