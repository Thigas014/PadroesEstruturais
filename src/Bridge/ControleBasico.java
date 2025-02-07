package Bridge;

public class ControleBasico extends ControleRemoto {
    public ControleBasico(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void ajustarVolume() {
        dispositivo.aumentarVolume();
    }
}

