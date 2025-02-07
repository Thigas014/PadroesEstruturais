package Bridge;

public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new TV();
        Dispositivo radio = new Radio();

        ControleRemoto controleBasicoTV = new ControleBasico(tv);
        ControleRemoto controleAvancadoRadio = new ControleAvancado(radio);

        System.out.println("Usando Controle Básico para TV:");
        controleBasicoTV.ligar();
        controleBasicoTV.ajustarVolume();
        controleBasicoTV.desligar();

        System.out.println("\nUsando Controle Avançado para Rádio:");
        controleAvancadoRadio.ligar();
        controleAvancadoRadio.ajustarVolume();
        controleAvancadoRadio.desligar();
    }
}

