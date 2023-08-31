package br.com.fuctura.projeto.profile;

import br.com.fuctura.projeto.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration // usado a nivel de classe
@Profile("test")
public class TestProfile {

    @Autowired
    private DBService dbService;

    // todo metodo dentro de uma classe anotada com @configuration tem q tem o @Bean nos metodos

    @Bean // usado a nivel de metodo, ele diz que esta criando alguma coisa e esta devolvendo dentro da aplicacao
    public void instanciaDB() {
        this.dbService.instanciaDB();
    }

}
