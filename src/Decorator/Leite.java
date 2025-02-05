package Decorator;

public class Leite extends CafeDecorator{
    public Leite(Cafe cafed){
        super(cafed);
    }
    @Override
    public String descricao(){
        return super.descricao() + ", com leite";
    }

    @Override
    public double valor(){
        return super.valor() + 2.0;
    }
}
