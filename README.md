
# Segundo Projeto - PROGRAMAÇÃO III

A fim de solucionar o problema em relação à leitura de tweets em arquivos CSV em 15 idiomas diferentes presentes na Europa, este projeto foi criado pelos autores com o intuito de resolver essa problemática utilizando listas introduzidas nas aulas de programação, sendo elas: Lista Simples Encadeada, Lista Simples Encadeada Circular, Lista Duplamente Encadeada e Lista Duplamente Encadeada Circular.

O nosso  trabalho busca encontrar as possiveis soluções para estes problemas: 

1) Qual o volume de tweets para cada idioma?

2) Qual o volume total de tweets positivos? E qual o volume total de tweets negativos?

3) Qual o idioma com mais tweets negativos? Qual o idioma com mais tweets positivos? É
possível fazer um ranking dos idiomas?

4) Algum tweeter teve registro em mais de um idioma? Qual, quais e/ou quantos?

-------------------------------------------------------------------------
## Autores

- Raphael Abade
- Raphael Souza
- Nathan Siqueira
- João Pedro
- Pedro Henrique de Ávila
- Délio


-------------------------------------------------------------------------

## Contribuindo

Contribuições são sempre bem-vindas!

Por favor, siga o `código de conduta` desse projeto.

Contribuições são feitas seguindo o acordado em sala ou por chamada de Discord.

## Deploy

Para fazer o deploy desse projeto rode

```bash
  npm run deploy
```


## 🔗 Links
[![portfolio](https://github.com/raphaelslima/Prog3_IFMG)


## Roadmap

Roadmap para o Projeto de Processamento de Tweets
- Definição e Planejamento (1-2 semanas)

      Objetivo do Projeto:

  Ler e processar tweets em 15 idiomas diferentes presentes na Europa partir de arquivos CSV. Utilizar listas encadeadas para armazenar e manipular os dados dos tweets.
    Escopo e Requisitos:
  Identificar quais idiomas serão suportados.
  
  Definir o formato dos arquivos CSV e os campos que serão utilizados.
  
  Estabelecer quais operações serão realizadas com os dados (e.g., inserção, busca, remoção).

- Preparação do Ambiente (1 semana)

    Configuração do Ambiente de Desenvolvimento:

Escolher a linguagem de programação (java).
  Separação de atribuições do projeto:

  - Questão 1: Nathan Siqueira e Délio.

    Neste código, manipulamos arquivos CSV que contêm dados de sentimentos do Twitter em diferentes idiomas. Com o objetivo de carregar esses dados em listas específicas para cada idioma e, em seguida, imprimir o volume de tweets processados para cada uma dessas listas. 

Primeiramente definimos os caminhos para vários arquivos CSV, cada um contendo tweets em diferentes idiomas. Os caminhos dos arquivos são armazenados em variáveis de string. 

Em seguida, chamamos o método tranformaArquivoParaLista para cada arquivo, que transforma o conteúdo do arquivo CSV em uma lista específica para cada idioma. Este método é chamado para todas as listas definidas, como listaTeste, listaAlba, listaBosn, etc.

Após carregar os dados, fizemos a impressão do volume de tweets (ou o tamanho da lista) para cada idioma. O método getTamanho é utilizado para obter o número de tweets em cada lista, e esses valores são impressos no console.

    ## RESPOSTA DA QUESTÃO: ##

  Volume de Tweets Albania: 53005
  Volume de Tweets Bósnia: 44583
  Volume de Tweets Croácia: 97291
  Volume de Tweets Inglês: 103034
  Volume de Tweets Alemão: 109130
  Volume de Tweets Húngaro: 68505
  Volume de Tweets Polonês: 223574
  Volume de Tweets Português: 157393
  Volume de Tweets Russo: 107773
  Volume de Tweets Sérvio: 73783
  Volume de Tweets Eslovaco: 70425
  Volume de Tweets Esloveno: 133935
  Volume de Tweets Espanhol: 275588
  Volume de Tweets Sueco: 58547

  - Questão 2: Pedro Ávila, Raphael Abade.
  
  - Questão 3: Raphael Abade.

  Eu, Raphael Abade, fiquei responsável de fazer a questão 3, de verificar qual é a linguagem com maior quantidade de tweets e qual o menor, e se é possível fazer um ranking
Para isso, eu criei o método sentimento, que lerá os arquivos dentro de um diretorio "./linguagem" (linux), depois lerá linha por linha de arquivo por arquivo.

  Enquanto é lido linha por linha, as variáveis max e min fazem a comparação para ver qual tem mais tweets positivos e qual tem menos. Também reutilizei códigos usado nas aulas de lista para fazer o ranking. Como os contadores são diferentes, a lista do mais ao menos positivo está diferente da lista do mais negativo ao menos, então o método printer() duplicará as linguagens, mas retornará "rankeado, mas duplicado"

  - Questão 4: Raphael Souza Lima, Joâo Pedro.


![Logo](https://logodix.com/logo/1002814.png)



