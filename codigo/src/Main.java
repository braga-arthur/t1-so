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
        
        System.out.println( lerArquivo("in.txt") );
        //passar arquivo fazer leitura e enviar pedido
    }
}