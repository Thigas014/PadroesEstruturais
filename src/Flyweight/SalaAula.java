package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class SalaAula {
    private final List<Cadeira> cadeiras =new ArrayList<>();

    public void adicionarCadeira(String tipo,String cor, int numero){
        Cadeira cadeira = CadeiraFactory.getCadeira(tipo, cor);
        cadeiras.add(cadeira);
        cadeira.exibir(numero);
    }
}
