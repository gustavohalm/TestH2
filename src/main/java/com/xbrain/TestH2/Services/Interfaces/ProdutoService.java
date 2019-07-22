package com.xbrain.TestH2.Services.Interfaces;

import com.xbrain.TestH2.Models.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    List<Produto> findAll();
    Optional<Produto> findById(Long id);
    Produto create(Produto produto);
    Produto update(Produto produto);
    void delete(Produto produto);
}
