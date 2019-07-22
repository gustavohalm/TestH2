package com.xbrain.TestH2.Services;

import com.xbrain.TestH2.Models.Pedido;
import com.xbrain.TestH2.Repositories.PedidoRepository;
import com.xbrain.TestH2.Services.Interfaces.PedidoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoSeviceImpl implements PedidoService {

    private PedidoRepository pedidoRepository;

    public PedidoSeviceImpl(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<Pedido> findAll() {
        return this.pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> find(Long id) {
        return this.pedidoRepository.findById(id);
    }

    @Override
    public Pedido create(Pedido pedido) {
        return this.pedidoRepository.save(pedido);
    }

    @Override
    public Pedido update(Pedido pedido) {
        return this.pedidoRepository.save(pedido);
    }

    @Override
    public void delete(Pedido pedido) {
        pedidoRepository.delete(pedido);
    }


}
