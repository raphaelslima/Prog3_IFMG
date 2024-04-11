import java.io.*;
import java.util.*;

class Principal {

    public static void main(String[] args) {

        try {
            BufferedReader leitorLinha = new BufferedReader(new FileReader("Dataset_Facebook.csv"));
            String linha = leitorLinha.readLine();
            while (linha != null) {
                String campos[] = linha.split(";");
                System.out.println(linha);
                linha = leitorLinha.readLine();
                System.out.println(campos[0]);
                System.out.println(campos[18]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}