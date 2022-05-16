import java.io.*;

public class Main {
    private static String lerArquivo(String path) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(path));
        String arquivo = "";
        String linha = "";

        while(linha != null) {
            linha = br.readLine();
            if(linha != null) arquivo += (linha + "\n");
        }

        br.close();

        return arquivo;
    }

    public static void main(String[] args) throws Exception {


        // esteira 1 embala
        Esteira esteira = new Esteira(1,10);
        Braco braco = new Braco(1, esteira);


        Produto produto = new Produto(1,100);
        Produto produto1 = new Produto(2,100);
        Produto produto2 = new Produto(3,200);

        Produto[] produtos = new Produto[3];
        produtos[0] = produto;
        produtos[1] = produto1;
        produtos[2] = produto2;


        //retorno do tipo pacote
        braco.embalar(produtos);


        // esteira 2 embala
        Esteira esteira2 = new Esteira(1,10);
        Braco braco2 = new Braco(1, esteira2);


        Produto produto3 = new Produto(4,100);
        Produto produto4 = new Produto(5,100);
        Produto produto5 = new Produto(6,200);

        Produto[] produtos2 = new Produto[3];
        produtos[0] = produto3;
        produtos[1] = produto4;
        produtos[2] = produto5;

        //retorno do tipo pacote
        braco.embalar(produtos);

        System.out.println( lerArquivo("in.txt") );
        //passar arquivo fazer leitura e enviar pedido
    }
}