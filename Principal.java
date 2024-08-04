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
        ListaEncadeada listaTeste = new ListaEncadeada<>();
        ListaEncadeada listaAlba = new ListaEncadeada<>();
        ListaEncadeada listaBosn = new ListaEncadeada<>();
        ListaEncadeada listaCroa = new ListaEncadeada<>();
        ListaEncadeada listaEngl = new ListaEncadeada<>();
        ListaEncadeada listaGerm = new ListaEncadeada<>();
        ListaEncadeada listaHung = new ListaEncadeada<>();
        ListaEncadeada listaPoli = new ListaEncadeada<>();
        ListaEncadeada listaPort = new ListaEncadeada<>();
        ListaEncadeada listaRuss = new ListaEncadeada<>();
        ListaEncadeada listaSerb = new ListaEncadeada<>();
        ListaEncadeada listaSlovak = new ListaEncadeada<>();
        ListaEncadeada listaSlovenian = new ListaEncadeada<>();
        ListaEncadeada listaSpan = new ListaEncadeada<>();
        ListaEncadeada listaSwed = new ListaEncadeada<>();
        
        //Chama os arquivos
        String arquivoAlba = "./datasetTwitters/Albanian_Twitter_Sentiment.csv";
        String arquivoBosn = "./datasetTwitters/Bosnian_Twitter_Sentiment.csv";
        String arquivoCroa = "./datasetTwitters/Croatian_Twitter_Sentiment.csv";
        String arquivoEngl = "./datasetTwitters/English_Twitter_Sentiment.csv";
        String arquivoGerm = "./datasetTwitters/German_Twitter_Sentiment.csv";
        String arquivoHung = "./datasetTwitters/Hungarian_Twitter_Sentiment.csv";
        String arquivoPoli = "./datasetTwitters/Polish_Twitter_Sentiment.csv";
        String arquivoPort = "./datasetTwitters/Portuguese_Twitter_Sentiment.csv";
        String arquivoRuss = "./datasetTwitters/Russian_Twitter_Sentiment.csv";
        String arquivoSerb = "./datasetTwitters/Serbian_Twitter_Sentiment.csv";
        String arquivoSlovak = "./datasetTwitters/Slovak_Twitter_Sentiment.csv";
        String arquivoSlovenian = "./datasetTwitters/Slovenian_Twitter_Sentiment.csv";
        String arquivoSpan = "./datasetTwitters/Spanish_Twitter_Sentiment.csv";
        String arquivoSwed = "./datasetTwitters/Swedish_Twitter_Sentiment.csv";

        System.out.println("--------------------Questão 1-------------------------------");

        
        //Chama o método tranformaArquivoParaLista
        listaAlba.tranformaArquivoParaLista(arquivoAlba, listaAlba);
        listaBosn.tranformaArquivoParaLista(arquivoBosn, listaBosn);
        listaCroa.tranformaArquivoParaLista(arquivoCroa, listaCroa);
        listaEngl.tranformaArquivoParaLista(arquivoEngl, listaEngl);
        listaGerm.tranformaArquivoParaLista(arquivoGerm, listaGerm);
        listaHung.tranformaArquivoParaLista(arquivoHung, listaHung);
        listaPoli.tranformaArquivoParaLista(arquivoPoli, listaPoli);
        listaPort.tranformaArquivoParaLista(arquivoPort, listaPort);
        listaRuss.tranformaArquivoParaLista(arquivoRuss, listaRuss);
        listaSerb.tranformaArquivoParaLista(arquivoSerb, listaSerb);
        listaSlovak.tranformaArquivoParaLista(arquivoSlovak, listaSlovak);
        listaSlovenian.tranformaArquivoParaLista(arquivoSlovenian, listaSlovenian);
        listaSpan.tranformaArquivoParaLista(arquivoSpan, listaSpan);
        listaSwed.tranformaArquivoParaLista(arquivoSwed, listaSwed);

        //Printa o volume de Tweets de cada idioma
        System.out.println("Volume de Tweets Albania: " + listaAlba.getTamanho());
        System.out.println("Volume de Tweets Bósnia: " + listaBosn.getTamanho());
        System.out.println("Volume de Tweets Croácia: " + listaCroa.getTamanho());
        System.out.println("Volume de Tweets Inglês: " + listaEngl.getTamanho());
        System.out.println("Volume de Tweets Alemão: " + listaGerm.getTamanho());
        System.out.println("Volume de Tweets Húngaro: " + listaHung.getTamanho());
        System.out.println("Volume de Tweets Polonês: " + listaPoli.getTamanho());
        System.out.println("Volume de Tweets Português: " + listaPort.getTamanho());
        System.out.println("Volume de Tweets Russo: " + listaRuss.getTamanho());
        System.out.println("Volume de Tweets Sérvio: " + listaSerb.getTamanho());
        System.out.println("Volume de Tweets Eslovaco: " + listaSlovak.getTamanho());
        System.out.println("Volume de Tweets Esloveno: " + listaSlovenian.getTamanho());
        System.out.println("Volume de Tweets Espanhol: " + listaSpan.getTamanho());
        System.out.println("Volume de Tweets Sueco: " + listaSwed.getTamanho());

        ListaEncadeada lista = new ListaEncadeada();
        System.out.println();
        System.out.println("--------------------Questão 2 e 3-------------------------------");
        System.out.println();
        lista.sentimento();
    }

}
