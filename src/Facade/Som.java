package Facade;

public class Som {
    public void desmutar(){
        System.out.println("Som lifado");
    }

    public void mutar (){
        System.out.println(("Som desligado"));
    }

    public void volume(int nivel){
        System.out.println("Volume ajustado para: " + nivel);
    }

}
