package com.xbrain.TestH2.Repositories;

import com.xbrain.TestH2.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
        Cliente getOne(Long id);

}
