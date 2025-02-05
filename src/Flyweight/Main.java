package Flyweight;

public class Main {
    public static void main(String[] args) {
        SalaAula sala = new SalaAula();

        sala.adicionarCadeira("Professor", "Preta", 1);
        sala.adicionarCadeira("Aluno - Braço Direto", "Verde", 2);
        sala.adicionarCadeira("Aluno - Braço Esquerdo", "Verde", 3);
        sala.adicionarCadeira("Aluno - Braço Direto", "Verde", 4);
        sala.adicionarCadeira("Aluno - Braço Esquerdo", "Verde", 5);
        sala.adicionarCadeira("Professor", "Preta", 6);
    }
}
