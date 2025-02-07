package Proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyImagem implements Imagem {
    private String nomeArquivo;
    private static Map<String, ImagemReal> cache = new HashMap<>();

    public ProxyImagem(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void exibir() {
        if (!cache.containsKey(nomeArquivo)) {
            cache.put(nomeArquivo, new ImagemReal(nomeArquivo));
        }
        cache.get(nomeArquivo).exibir();
    }
}

