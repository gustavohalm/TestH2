package com.xbrain.TestH2.Controllers;

import com.xbrain.TestH2.Models.Entrega;
import com.xbrain.TestH2.Models.Pedido;
import com.xbrain.TestH2.Services.Interfaces.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entregas")
public class EntregaController {

    @Autowired
    private EntregaService entregaService;

    public EntregaController(EntregaService entregaService) {
        this.entregaService = entregaService;
    }

    @GetMapping
    @ResponseBody
    public List<Entrega> getEntregas()
    {
        return this.entregaService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Entrega> getEntrega(@PathVariable("id") Long id)
    {
        return this.entregaService.find(id);
    }


    @PostMapping
    @ResponseBody
    public Entrega create(@RequestBody Entrega entrega)
    {
        return  this.entregaService.create(entrega);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Entrega update(@RequestBody Entrega entrega)
    {
        return  this.entregaService.update(entrega);
    }


    @DeleteMapping("/{id}")
    public void delete(@RequestBody Entrega entrega)
    {
       this.entregaService.delete(entrega);
    }

}
