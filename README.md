# 🚀 Curso Spring Boot

Projeto desenvolvido durante os estudos de **Spring Boot**, com foco na construção de uma API REST utilizando Java e as principais tecnologias do ecossistema Spring.

## 📚 Objetivos

Este projeto tem como objetivo praticar conceitos fundamentais de desenvolvimento Backend, incluindo:

- Criação de APIs REST
- Arquitetura em camadas
- Persistência de dados com JPA/Hibernate
- Validação de dados
- Controle de versões do banco com Flyway
- Integração com MySQL
- Boas práticas utilizando Spring Boot

---

## 🛠 Tecnologias Utilizadas

- Java 23
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Bean Validation
- Flyway
- MySQL
- Maven
- Lombok

---

## 📁 Estrutura do Projeto

```
src
├── main
│   ├── java
│   │   └── med/voll/api
│   │       ├── controller
│   │       ├── domain
│   │       ├── repository
│   │       └── ApiApplication
│   └── resources
│       ├── db
│       │   └── migration
│       └── application.properties
```

---

## ⚙️ Configuração

### Clone o repositório

```bash
git clone https://github.com/matheuscoliv/Curso-Spring-Boot.git
```

Entre na pasta

```bash
cd Curso-Spring-Boot
```

---

### Configure o banco de dados

Crie um banco chamado:

```text
vollmed_api
```

Configure o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_api
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## ▶️ Executando o projeto

Pelo Maven:

```bash
./mvnw spring-boot:run
```

Ou execute a classe

```
ApiApplication.java
```

A aplicação ficará disponível em:

```
http://localhost:8080
```

---

## 📌 Funcionalidades

Atualmente a API permite:

- Cadastro de médicos
- Validação automática dos dados
- Persistência no MySQL
- Controle de migrations com Flyway

---

## 📦 Exemplo de requisição

### POST `/medicos`

```json
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "crm": "654321",
  "especialidade": "CARDIOLOGIA",
  "endereco": {
    "logradouro": "Rua A",
    "bairro": "Centro",
    "cep": "74000000",
    "cidade": "Goiânia",
    "uf": "GO",
    "numero": "100",
    "complemento": "Sala 10"
  }
}
```

---

## 🗃 Banco de Dados

O projeto utiliza **Flyway** para versionamento do banco de dados.

As migrations ficam em:

```
src/main/resources/db/migration
```

Exemplo:

```
V1__create-table-medicos.sql
V2__add-column-telefone.sql
```

---

## 📖 Aprendizados

Durante o desenvolvimento foram praticados:

- Spring Boot
- REST APIs
- DTOs
- Records
- Injeção de Dependência
- JPA
- Hibernate
- Bean Validation
- Flyway
- Maven
- Boas práticas de organização de código

---
GitHub:
https://github.com/matheuscoliv
