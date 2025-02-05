package Decorator;

public class Main {
    public static void main(String[] args) {
        Cafe cafed = new CafeSimples();
        System.out.println(cafed.descricao() + " custa R$ " + cafed.valor());

        cafed = new Leite(cafed);
        System.out.println(cafed.descricao() + " custa R$ " + cafed.valor());

        cafed = new Chocolate(cafed);
        System.out.println(cafed.descricao() + " custa R$ " + cafed.valor());

    }
}
