package com.app.facturacliente.models.dao;

import com.app.facturacliente.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IClienteDao  extends PagingAndSortingRepository<Cliente, Long>, CrudRepository<Cliente, Long> { // DAO stands for DATA ACCESS OBJECT



    /*    public List<Cliente> findAll();
    public void save(Cliente cliente);
    public Cliente findOne(Long id);
    public void delete(Long id);*/

}
