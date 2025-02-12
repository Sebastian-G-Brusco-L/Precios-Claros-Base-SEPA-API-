package com.sebrus.precios_sepa.sucursal;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {


    Page<Sucursal> findByIdBandera(Pageable pageable, Integer idBandera);

    Page<Sucursal> findByIdComercio(Pageable pageable, Integer idSucursal);

    Page<Sucursal> findBySucursalesLocalidadContainingIgnoreCase(Pageable pageable, String localidad);

    Page<Sucursal> findBySucursalesBarrioContainingIgnoreCase(Pageable pageable, String provincia);
}
