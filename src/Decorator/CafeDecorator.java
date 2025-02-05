package Decorator;

public abstract class CafeDecorator implements Cafe {
    protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafed){
        this.cafeDecorado = cafed;
    }

    @Override
    public String descricao() {
        return cafeDecorado.descricao();
    }

    @Override
    public double valor() {
        return cafeDecorado.valor();
    }
}
