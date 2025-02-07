package Adapter;

public class Main {
    public static void main(String[] args) {
        TomadaAmericana dispositivo = new AdaptadorTomada();
        dispositivo.conectarNaTomadaAmericana();
    }
}

