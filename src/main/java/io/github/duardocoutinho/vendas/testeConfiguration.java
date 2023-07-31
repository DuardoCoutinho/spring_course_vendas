package io.github.duardocoutinho.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class testeConfiguration {

    @Bean(name = "applicationName")
    public String applicationName() {
        return "Sistema de Vendas";
    }
}
