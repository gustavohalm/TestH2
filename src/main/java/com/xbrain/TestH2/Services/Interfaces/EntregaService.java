package com.xbrain.TestH2.Services.Interfaces;

import com.xbrain.TestH2.Models.Entrega;
import java.util.List;
import java.util.Optional;

public interface EntregaService {

    List<Entrega> findAll();
    Optional<Entrega> find(Long id);
    Entrega create(Entrega entrega);
    Entrega update(Entrega entrega);
    void delete(Entrega entrega);

}
