package com.app.facturacliente.models.dao;

import com.app.facturacliente.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}
