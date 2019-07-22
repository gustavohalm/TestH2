package com.xbrain.TestH2.Controllers;

import com.xbrain.TestH2.Models.Pedido;
import com.xbrain.TestH2.Services.Interfaces.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    @ResponseBody
    public List<Pedido> getPedidos()
    {
       return this.pedidoService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Pedido> getPedido(@PathVariable("id") Long id )
    {
        return this.pedidoService.find(id);
    }

    @PostMapping
    @ResponseBody
    public Pedido create(@RequestBody Pedido pedido)
    {
        return  this.pedidoService.create(pedido);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Pedido update(@RequestBody Pedido pedido)
    {
        return this.pedidoService.update(pedido);
    }

    @DeleteMapping("/{id}")
    public  void delete(@RequestBody Pedido pedido)
    {
        this.pedidoService.delete(pedido);
    }

}
