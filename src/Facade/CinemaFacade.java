package Facade;

public class CinemaFacade {
    private Tv tv;
    private Som som;
    private Luzes luz;

    public CinemaFacade(){
        this.tv = new Tv();
        this.som = new Som();
        this.luz = new Luzes();
    }

    public void assistirFilme(){
        System.out.println("\n Ajuste para assistir um filme...");
        luz.apagar();
        tv.ligar();
        som.desmutar();
        som.volume(25);
        System.out.println("Filme pronto para começar!");
    }

    public void encerrarFilme(){
        System.out.println("\n Encerrando o filme...");
        luz.acender();
        som.mutar();
        tv.desligar();
        System.out.println("Sessão encerrada!");
    }
}
