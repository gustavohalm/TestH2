package com.xbrain.TestH2.Services;

import com.xbrain.TestH2.Models.Produto;
import com.xbrain.TestH2.Repositories.ProdutoRepository;
import com.xbrain.TestH2.Services.Interfaces.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    private ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> findAll() {
        return this.produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> findById(Long id) {
        return this.produtoRepository.findById(id);
    }

    @Override
    public Produto create(Produto produto) {
        return this.produtoRepository.save(produto);
    }

    @Override
    public Produto update(Produto produto) {
        return this.produtoRepository.save(produto);
    }

    @Override
    public void delete(Produto produto) {
         this.produtoRepository.delete(produto);
    }
}
