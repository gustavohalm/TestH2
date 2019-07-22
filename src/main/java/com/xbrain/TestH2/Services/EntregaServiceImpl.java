package com.xbrain.TestH2.Services;

import com.xbrain.TestH2.Models.Entrega;
import com.xbrain.TestH2.Repositories.EntregaRepository;
import com.xbrain.TestH2.Services.Interfaces.EntregaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntregaServiceImpl implements EntregaService {

    private EntregaRepository entregaRepository;

    public EntregaServiceImpl(EntregaRepository entregaRepository) {
        this.entregaRepository = entregaRepository;
    }

    @Override
    public List<Entrega> findAll() {
        return this.entregaRepository.findAll();
    }

    @Override
    public Optional<Entrega> find(Long id) {
        return this.entregaRepository.findById(id);
    }

    @Override
    public Entrega create(Entrega entrega) {
        return this.entregaRepository.save(entrega);
    }

    @Override
    public Entrega update(Entrega entrega) {
        return this.entregaRepository.save(entrega);
    }

    @Override
    public void delete(Entrega entrega) {
        this.entregaRepository.save(entrega);
    }
}
