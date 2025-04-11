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