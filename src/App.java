import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * IMPLEMENTACAO BASICA !!! EXCESSO DE CODIGOS
 */

public class App {
    public static void main(String[] args) throws Exception {
        String path = "d:\\in.txt"; // caminho do arquivo
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path); // Sream de leitura relativa ao arquivo do caminho path
            br = new BufferedReader(fr); // O BufferedReader é instanciado a partir do FileReader
            String line = br.readLine(); // Recebe a linha do aquivo

            while (line != null) {
                System.out.println(line);
                line = br.readLine(); // lê a proxima linha
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("ERROR: " + e.getMessage());
                e.getStackTrace();
            }
        }
    }// main
}// class
