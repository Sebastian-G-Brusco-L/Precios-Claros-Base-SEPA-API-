package com.sebrus.precios_sepa.comercio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface ComercioRepository extends JpaRepository<Comercio,Integer> {


    Page<Comercio> findByIdBandera(Pageable pageable, Integer idBandera);


    Optional<Comercio> findByComercioCuit( String idCuit);

}
