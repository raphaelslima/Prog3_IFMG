import java.io.*;
import java.util.*;

class Principal {

    public static void main(String[] args) {

        // TP1
        /*String arquivo = "./Dataset_Facebook.csv";

        int hora = 0;
        int semana = 0;
        int mes = 0;

        int likesTotais = 0, qtdeInteracao = 0;
        String tipo = "", categoria = "", comentarios = "", compartilhamentos = "";
        boolean ehPago = true;
        boolean pular1 = false;

        int totalAlcance = 0, totalImpressoes = 0, engajadosUsuarios = 0, clientes = 0, consumo = 0,
                impressoesPorLike = 0, alcancePorLike = 0, engajadosLike = 0;

        PostLifetime postLifetime = new PostLifetime(totalAlcance, totalImpressoes, engajadosUsuarios,
                clientes, consumo, impressoesPorLike, alcancePorLike, engajadosLike);

        PostInfos postInfos = new PostInfos(likesTotais, tipo, qtdeInteracao, categoria, comentarios, compartilhamentos,
                ehPago);

        PostTime postTime = new PostTime(hora, semana, mes);

        try (Scanner scanner = new Scanner(new File(arquivo))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (pular1 == true) {
                    String[] campos = linha.split(";", 19);
                    postInfos = new PostInfos(Integer.parseInt(campos[0]), campos[1], Integer.parseInt(campos[2]),
                            campos[3], campos[4], campos[5], Boolean.parseBoolean(campos[6]));

                    postLifetime = new PostLifetime(Integer.parseInt(campos[7]), Integer.parseInt(campos[8]),
                            Integer.parseInt(campos[9]), Integer.parseInt(campos[10]), Integer.parseInt(campos[11]),
                            Integer.parseInt(campos[12]), Integer.parseInt(campos[13]), Integer.parseInt(campos[14]));

                    postTime = new PostTime(Integer.parseInt(campos[12]), Integer.parseInt(campos[13]),
                            Integer.parseInt(campos[14]));

                    postInfos.imprimeTudo();
                    postLifetime.imprimeTudo();
                    postTime.imprimeTudo();

                    System.out.println(
                            "--------------------------------------------------------------------------------------------------");
                    System.out.println("");
                }
                pular1 = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //TP2
        String arquivo = "./datasetTwitters/teste.csv";
        boolean pular1Linha = true;
        try (Scanner scanner = new Scanner(new File(arquivo))) {
            scanner.useDelimiter(",");
            ListaEncadeada listaPT = new ListaEncadeada<>();
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (!pular1Linha) {
                    int primeiraVirgula = linha.indexOf(',');
                    int segundaVirgula = linha.indexOf(',', primeiraVirgula + 1);
        
                    String tweetID = linha.substring(0, primeiraVirgula);
                    String handLabel = linha.substring(primeiraVirgula + 1, segundaVirgula);
                    String AnnotatorID = linha.substring(segundaVirgula + 1);

                    listaPT.adicionar(tweetID, handLabel, AnnotatorID);
                }else{
                    pular1Linha = false;
                }
                }
                listaPT.percorreLista();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}