# CRUD — Da Mão ao Framework

Projeto de estudo criado para entender, na prática, o que frameworks abstraem.

A mesma entidade, `Produto`, será construída e evoluída em etapas, começando com código puro e avançando até uma aplicação com backend, API REST e frontend.

## Objetivo

Aprender a implementar um CRUD na unha antes de utilizar abstrações prontas de frameworks.

A ideia é entender:

* como salvar e manipular dados manualmente;
* como separar responsabilidades;
* o que Spring Boot e JPA fazem por trás;
* como funciona uma API REST;
* como um frontend consome uma API.

## Backend

### Fase 1 — Java Puro

* CRUD no console
* Dados armazenados em memória
* `List<Produto>`
* `Scanner`
* Repository implementado manualmente
* Service com regras de negócio
* Exceções customizadas

Branch:

`backend/java-puro`

### Fase 2 — Spring Boot + JPA

* Spring Boot
* JPA
* MySQL
* `JpaRepository`
* Persistência real
* Service integrado ao Repository

Branch:

`backend/spring-jpa`

### Fase 3 — API REST

* `@RestController`
* Endpoints HTTP
* DTOs
* Tratamento global de exceções
* Status HTTP adequados

Branch:

`backend/api-rest`

## Frontend

O frontend seguirá a mesma proposta:

1. TypeScript + DOM puro
2. React
3. React consumindo a API Java

## Regra principal — NO IA

Este projeto é um desafio pessoal de desenvolvimento sem IA gerando código.

Não é permitido utilizar IA para:

* gerar classes, métodos ou funções;
* completar código;
* corrigir código;
* resolver erros;
* criar lógica de negócio;
* gerar testes;
* explicar exatamente como implementar uma tarefa específica do projeto.

São permitidos:

* documentação oficial;
* JavaDoc;
* documentação do Spring;
* documentação do TypeScript e React;
* debugger;
* autocomplete tradicional da IDE;
* pesquisas por mensagens de erro;
* Stack Overflow e fóruns técnicos.

O objetivo é escrever, entender e depurar o código manualmente.

## Entidade principal

`Produto`

Atributos:

* `id`
* `nome`
* `preco`
* `estoque`

## Status

| Fase                          | Status                |
| ----------------------------- | --------------------- |
| Java puro                     | 🚧 Em desenvolvimento |
| Spring + JPA                  | ⬜ Não iniciado        |
| API REST                      | ⬜ Não iniciado        |
| TypeScript puro               | ⬜ Não iniciado        |
| React                         | ⬜ Não iniciado        |
| Integração frontend + backend | ⬜ Não iniciado        |
