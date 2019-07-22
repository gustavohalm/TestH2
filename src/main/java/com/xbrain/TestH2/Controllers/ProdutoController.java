package com.xbrain.TestH2.Controllers;

import com.xbrain.TestH2.Models.Produto;
import com.xbrain.TestH2.Services.Interfaces.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }


    @GetMapping
    @ResponseBody
    public List<Produto> getProdutos()
    {
        return this.produtoService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Produto> getProduto(@PathVariable("id") Long id)
    {
        return produtoService.findById(id);
    }

    @PostMapping
    @ResponseBody
    public Produto create(@RequestBody Produto produto)
    {
        return produtoService.create(produto);
    }

    @PutMapping
    @ResponseBody
    public Produto update(@RequestBody Produto produto)
    {
        return produtoService.update(produto);
    }

    @DeleteMapping
    @ResponseBody
    public void delete(@RequestBody Produto produto)
    {
        produtoService.delete(produto);
    }

}

