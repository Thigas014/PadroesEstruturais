package Composite;

public class Main {
    public static void main(String[] args) {
        Diretorio raiz = new Diretorio("Raiz");

        Diretorio documentos = new Diretorio("Documentos");
        Diretorio imagens = new Diretorio("Imagens");

        Arquivo arquivo1 = new Arquivo("relatorio.pdf");
        Arquivo arquivo2 = new Arquivo("foto.png");

        documentos.adicionar(arquivo1);
        imagens.adicionar(arquivo2);

        raiz.adicionar(documentos);
        raiz.adicionar(imagens);

        System.out.println("Estrutura de Arquivos:");
        raiz.exibir("");
    }
}

