package Flyweight;

public class CadeiraConcreta implements Cadeira{
    private final String tipo;
    private final String cor;

    public CadeiraConcreta(String tipo, String cor){
        this.tipo = tipo;
        this.cor = cor;
    }

    @Override
    public void exibir(int numero) {
        System.out.println("Cadeira #" + numero + " | Tipo: " + tipo + " | Cor: " + cor);
    }
}
