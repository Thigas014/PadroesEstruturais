package Adapter;

public class AdaptadorTomada extends TomadaEuropeia implements TomadaAmericana {
    @Override
    public void conectarNaTomadaAmericana() {
        System.out.println("Adaptador convertendo conexão...");
        conectarNaTomadaEuropeia();
    }
}

