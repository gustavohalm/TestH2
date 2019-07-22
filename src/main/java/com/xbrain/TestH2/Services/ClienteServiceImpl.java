package com.xbrain.TestH2.Services;

import com.xbrain.TestH2.Models.Cliente;
import com.xbrain.TestH2.Repositories.ClienteRepository;
import com.xbrain.TestH2.Services.Interfaces.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;
    private Long id;
    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> find(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        clienteRepository.delete(cliente);
    }
    @Override
    public Cliente update(Cliente cliente)
    {
        return null;
    }
}
