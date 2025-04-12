# desafioTecnico
Desafio Prático – Desenvolvedor (a) Backend Java

>**Objetivo**: Criar uma aplicação backend utilizando Java com o framework Spring 
Boot, que implemente uma arquitetura de microservices, se comunique com um 
banco de dados e troque mensagens entre serviços utilizando um broker de 
mensagens.
 
## Requisitos: 
- **Linguagem**: Java 11 ou superior. 
- **Framework**: Spring Boot (`versão mais recente ou >= 2.5`). 
- **Microservices**: Deve criar dois ou mais microservices que interajam entre si. 
- **Banco de Dados**: O projeto deve utilizar um banco de dados relacional (MySQL, 
PostgreSQL, ou outro à escolha do candidato). 
- **Broker de Mensagens**: Utilizar um broker de mensagens para comunicação entre 
microservices (`RabbitMQ, Kafka ou outro`).

## Descrição do Desafio: 
Implemente um sistema para gerenciar pedidos de uma loja online. 
- **Serviço de Pedidos**: 
Responsável por criar, listar e atualizar o status de um pedido. 
Persistir os dados em um banco de dados relacional.
 
## Serviço de Pagamentos: 
Deve se comunicar com o serviço de pedidos para atualizar o status do pedido 
conforme o pagamento for confirmado. 
A comunicação entre o serviço de pedidos e o serviço de pagamentos deve ser 
feita via mensagens utilizando um broker (`RabbitMQ, Kafka, etc.`). 

## Critérios de Avaliação: 
- **Código Limpo**: Estrutura, organização e boas práticas de desenvolvimento. 
- **Microservices**: Implementação correta de microservices e interação entre eles. 
- **Comunicação Assíncrona**: Uso correto do broker de mensagens para 
comunicação entre serviços. 
- **Banco de Dados**: Modelagem adequada e operações com o banco de dados. 

----------------------------------------------------------------------------------------------------
<br>
Para o Desafio foi utilizado o Banco H2 e RabbitMQ.<br>
Para o Micro Serviço de Order ele cadastra o produto, busca o produto e fica de ouvinte do pagamento.<br>
Foi Criado 2 API, uma de criação do produto e outra para buscar todos os produtos.<br>
Segue abaixo o Exemplo do EndPoint.<br><br>
<b>POST</b>: http://localhost:8081/orders<br>
{
    "product": "Pendriver",
    "price": "20",
    "status":"Create"
}<br><br>
<b>GET</b>:http://localhost:8081/orders<br><br>
Para o Micro Serviço de Pagamento, criado uma API de pagamento, onde é passado o ID do pagamento e seu 
novo Status.<br><br>
<b>POST</b>:http://localhost:8082/payments<br>
{
    "id": "ea18564e-09dc-47e8-a767-ade533dfd6db",
    "product": "Pendriver",
    "price": "20",
    "status":"Aprovado"
}


