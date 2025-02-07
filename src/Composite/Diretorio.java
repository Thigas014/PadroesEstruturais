package Composite;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    public void remover(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public void exibir(String identacao) {
        System.out.println(identacao + "+ Diretório: " + nome);
        for (Componente componente : componentes) {
            componente.exibir(identacao + "  ");
        }
    }
}

