package Bridge;

public class ControleAvancado extends ControleRemoto {
    public ControleAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ajustarVolume() {
        dispositivo.aumentarVolume();
        dispositivo.aumentarVolume();
    }

    public void silenciar() {
        System.out.println("Silenciando dispositivo...");
        while (true) {
            dispositivo.diminuirVolume();
        }
    }
}

