package Decorator;

public class CafeSimples implements Cafe{
    @Override
    public String descricao(){
        return "Café Simples";
    }

    @Override
    public double valor() {
        return 1.0;
    }
}
