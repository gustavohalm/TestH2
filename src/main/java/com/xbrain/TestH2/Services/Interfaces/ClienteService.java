package com.xbrain.TestH2.Services.Interfaces;

import com.xbrain.TestH2.Models.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    public List<Cliente> findAll();
    public Optional<Cliente> find(Long id);
    public Cliente create(Cliente cliente);
    public void delete(Cliente cliente);
    public Cliente update(Cliente cliente);
}
