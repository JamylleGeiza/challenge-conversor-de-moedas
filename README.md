# challenge-conversor-de-moedas

💱 Conversor de Moedas - Challenge Java
Bem-vindo ao meu primeiro desafio de desenvolvimento Java! Este projeto é um Conversor de Moedas que interage com o usuário via console, consumindo dados em tempo real de uma API externa.

🎯 Objetivo do Desafio
Desenvolver uma aplicação em Java que ofereça:

Interação textual (via console) com um menu de no mínimo 6 opções de conversão.
Consumo de taxas de câmbio dinâmicas através da ExchangeRate-API.
Manipulação de dados JSON utilizando a biblioteca Gson.

🚀 Funcionalidades
O conversor permite as seguintes operações:

Dólar (USD) para Real (BRL)
Real (BRL) para Dólar (USD)
Dólar (USD) para Peso Argentino (ARS)
Peso Argentino (ARS) para Dólar (USD)
Dólar (USD) para Peso Colombiano (COP)
Peso Colombiano (COP) para Dólar (USD)

🛠️ Tecnologias Utilizadas
Linguagem: Java (versão 17+)
Biblioteca de JSON: Gson (v2.10.1)
API de Câmbio: ExchangeRate-API
Protocolo: HTTP (utilizando java.net.http.HttpClient)

📁 Estrutura do Projeto
O código está organizado em duas classes principais:

Principal.java: Responsável pela interface do usuário, exibição do menu e lógica do loop de interação.

ConsultaMoeda.java: Responsável por realizar as requisições HTTP e realizar o parse do JSON utilizando JsonParser e JsonObject.

⚙️ Como Executar
Clone este repositório.

Certifique-se de ter o JDK 17 ou superior instalado.

Adicione o arquivo JAR da biblioteca Gson ao seu projeto (ou configure via Maven/Gradle).

Obtenha sua chave gratuita na ExchangeRate-API.

Substitua SUA-CHAVE-AQUI no código da classe consultaMoeda.

Execute a classe Principal.

📝 Exemplo de Uso
Plaintext
***************************************************
Seja bem-vindo(a) ao Conversor de Moeda!

1) Dólar [USD] =>> Real [BRL]
   ...
   Escolha uma opção válida: 1
   Digite o valor que deseja converter: 100
   Valor 100.00 [USD] corresponde ao valor final de =>>> 510.00 [BRL]
***************************************************
👩‍💻 Autora
Jamylle

Estudante.

Interesses: Java, Kotlin, Android e Mystic Spirituality.