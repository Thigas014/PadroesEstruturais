package Decorator;

public class Chocolate extends CafeDecorator{
    public Chocolate (Cafe cafed){
        super(cafed);
    }
    @Override
    public String descricao(){
        return super.descricao() + ", com chocolate";
    }
    @Override
    public double valor(){
        return super.valor() + 3.0;
    }
}
