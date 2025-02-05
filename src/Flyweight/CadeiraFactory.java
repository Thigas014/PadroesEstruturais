package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CadeiraFactory {
    private static final Map<String, Cadeira> cadeiras = new HashMap<>();

    public static Cadeira getCadeira(String tipo, String cor){
        String chave =tipo + "-" + cor;

        if (!cadeiras.containsKey(chave)){
            cadeiras.put(chave, new CadeiraConcreta(tipo, cor));
            System.out.println("Nova cadeira criada: " + chave);
        }
        return cadeiras.get(chave);
    }
}
