# App RH

Aplicação web de Recursos Humanos desenvolvida no curso de Desenvolvedor Java
do Senai. Ela gerencia vagas e candidatos, funcionários e dependentes, com
login e páginas protegidas.

## Funcionalidades

- **Vagas:** cadastrar, listar, editar e excluir vagas (nome, descrição, data
  e salário).
- **Candidatos:** inscrever candidatos em uma vaga (nome, RG e e-mail) e
  removê-los.
- **Funcionários:** cadastrar, listar, editar e excluir funcionários.
- **Dependentes:** vincular dependentes (nome, CPF e data de nascimento) a
  cada funcionário.
- **Busca** na página inicial.
- **Login** com Spring Security e usuários em memória.

## Tecnologias

- Java 11
- Spring Boot 2.6 (Web, Data JPA, Security)
- Thymeleaf + Thymeleaf Extras Spring Security
- Bootstrap
- MySQL / MariaDB
- Maven

## Estrutura

```
src/main/java/com/AppRH/AppRH
├── controllers/          # Vagas, funcionários e busca
├── models/               # Vaga, Candidato, Funcionario, Dependente
├── repository/           # Interfaces Spring Data JPA
├── DataConfiguration.java  # Conexão com o banco
└── WebConfig.java          # Usuários e regras de acesso
```

Relacionamentos: uma vaga tem vários candidatos, e um funcionário tem vários
dependentes.

## Como rodar

Pré-requisitos: Java 11 e MySQL (ou MariaDB) rodando localmente.

1. Crie o banco:

   ```sql
   CREATE DATABASE AppRH;
   ```

2. Ajuste usuário e senha do seu banco em
   `src/main/java/com/AppRH/AppRH/DataConfiguration.java`.

3. Suba a aplicação:

   ```bash
   ./mvnw spring-boot:run
   ```

   No Windows: `mvnw.cmd spring-boot:run`.

4. Acesse `http://localhost:8080`. Os usuários de teste ficam em
   `WebConfig.java`.

As tabelas são criadas automaticamente na primeira execução.

## Autor

Desenvolvido por **Paulo Henrique Tomaz Martins** no curso de Desenvolvedor
Java do Senai.

- [LinkedIn](https://www.linkedin.com/in/paulo-henrique-517268269)
