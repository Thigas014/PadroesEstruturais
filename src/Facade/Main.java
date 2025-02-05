package Facade;

public class Main {
    public static void main(String[] args) {
        CinemaFacade cinema = new CinemaFacade();

        cinema.assistirFilme();
        cinema.encerrarFilme();
    }
}
