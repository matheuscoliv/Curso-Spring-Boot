package med.voll.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
Versionamento do banco de dados:
--padrao de nomeclatura: V + (identificador) + __ + nome-descritivo-arquivo + .sql
--V1__create-table-medicos.sql
--V2__update...sql--
*/
@SpringBootApplication
public class ApiApplication {
	/*carrega o tomcat, controllers...*/
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}


/* TERMINEI A ULTIMA AULA EM: ENTIDADES JPA */