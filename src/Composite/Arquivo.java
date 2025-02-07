package Composite;

public class Arquivo implements Componente {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String identacao) {
        System.out.println(identacao + "- Arquivo: " + nome);
    }
}

