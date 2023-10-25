package com.app.facturacliente.models.dao;

import com.app.facturacliente.models.entity.Cliente;

import java.util.List;

public interface IClienteDao { // DAO stands for DATA ACCESS OBJECT
    public List<Cliente> findAll();
    public void save(Cliente cliente);
    public Cliente findOne(Long id);
    public void delete(Long id);
}
