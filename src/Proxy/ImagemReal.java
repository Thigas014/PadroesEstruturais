package Proxy;

public class ImagemReal implements Imagem {
    private String nomeArquivo;

    public ImagemReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarImagem();
    }

    private void carregarImagem() {
        System.out.println("Carregando imagem: " + nomeArquivo);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo imagem: " + nomeArquivo);
    }
}

