package Proxy;

public class Main {
    public static void main(String[] args) {
        Imagem img1 = new ProxyImagem("foto1.png");
        Imagem img2 = new ProxyImagem("foto2.png");

        // Primeira vez: imagens são carregadas
        System.out.println("Exibindo imagens pela primeira vez:");
        img1.exibir();
        img2.exibir();

        // Segunda vez: imagens são recuperadas do cache
        System.out.println("\nExibindo imagens novamente:");
        img1.exibir();
        img2.exibir();
    }
}

