package com.sebrus.precios_sepa.productos;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, ProductoId> {

    Page<Producto> findById_IdProducto(Pageable pageable,Long idProducto);

    Page<Producto> findById_IdComercio(Pageable pageable,Integer idComercio);

    Page<Producto> findById_IdSucursal(Pageable pageable,Integer idSucursal);

    Page<Producto> findById_IdBandera(Pageable pageable,Integer idBandera);

    Page<Producto> findById_ProductosEan(Pageable pageable, String productosEan);

    Page<Producto> findByProductosDescripcionContainingIgnoreCase(Pageable pageable, String productosDescripcion);

    Page<Producto> findByOrderByProductosPrecioListaDesc(Pageable pageable);

    Page<Producto> findByOrderByProductosPrecioListaAsc(Pageable pageable);

    Page<Producto> findByProductosPrecioListaLessThanEqual(Pageable pageable, BigDecimal maxPrecio);

    Page<Producto> findByProductosPrecioListaBetween(Pageable pageable,BigDecimal minPrecio, BigDecimal maxPrecio);




}
