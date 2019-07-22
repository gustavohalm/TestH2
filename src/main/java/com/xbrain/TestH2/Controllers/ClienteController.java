package com.xbrain.TestH2.Controllers;


import com.xbrain.TestH2.Models.Cliente;
import com.xbrain.TestH2.Services.Interfaces.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    @ResponseBody
    public List<Cliente> getClientes()
    {
        return this.clienteService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Cliente> findById(@PathVariable("id") Long id)
    {
        return this.clienteService.find(id);
    }

    @PostMapping
    @ResponseBody
    public Cliente create(@RequestBody Cliente cliente)
    {
        return this.clienteService.create(cliente);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Cliente update(@RequestBody Cliente cliente)
    {
        return null;
    }

}
