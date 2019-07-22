package com.xbrain.TestH2.Services.Interfaces;

import com.xbrain.TestH2.Models.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {

    List<Pedido> findAll();
    Optional<Pedido> find(Long id);
    Pedido create(Pedido pedido);
    Pedido update(Pedido pedido);
    void delete(Pedido pedido);

}
