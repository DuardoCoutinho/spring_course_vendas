package io.github.duardocoutinho.vendas.service;

import io.github.duardocoutinho.vendas.model.Cliente;
import io.github.duardocoutinho.vendas.repository.clientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clientesService {

    private clientesRepository repository;

    @Autowired
    public clientesService( clientesRepository repository) {
        this.repository = repository;
        System.out.println("Instanciando clientesService");
    }

    public void salvarCliente(Cliente cliente) {

        validarCliente(cliente);
        this.repository.persistir(cliente);

        System.out.println("Salvando cliente no banco de dados");
    }

    public void validarCliente(Cliente cliente) {
        System.out.println("Validando cliente");
    }
}
