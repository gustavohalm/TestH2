package com.xbrain.TestH2.Controllers;


import com.xbrain.TestH2.Models.Cliente;
import com.xbrain.TestH2.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    @ResponseBody
    public List<Cliente> getClientes()
    {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Cliente> findById(@PathVariable("id") Long id)
    {
        return clienteRepository.findById(id);
    }

    @PostMapping
    @ResponseBody
    public Cliente create(@RequestBody Cliente cliente)
    {
        return this.clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Cliente update(@RequestBody Cliente cliente)
    {
        return this.clienteRepository.save(cliente);
    }

}
