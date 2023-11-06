package com.app.facturacliente.models.service;

import com.app.facturacliente.models.entity.Cliente;
import com.app.facturacliente.models.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface IClienteService{
    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    public void save(Cliente cliente);
    public Cliente findOne(Long id);
    public void delete(Long id);
    public List<Producto> findByNombre(String term);
}
