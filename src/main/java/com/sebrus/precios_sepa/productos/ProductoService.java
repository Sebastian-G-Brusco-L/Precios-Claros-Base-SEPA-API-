package com.sebrus.precios_sepa.productos;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    // crud

    public Page<Producto> findByIdProducto(Pageable pageable, Long idProducto) {
        return productoRepository.findById_IdProducto(pageable, idProducto);
    }

    public Page<Producto> findByIdComercio(Pageable pageable, Integer idComercio) {
        return productoRepository.findById_IdComercio(pageable, idComercio);
    }

    public Page<Producto> findByIdBandera(Pageable pageable, Integer idBandera) {
        return productoRepository.findById_IdBandera(pageable, idBandera);

    }

    public Page<Producto> findByIdSucursal(Pageable pageable, Integer idSucursal) {
        return productoRepository.findById_IdSucursal(pageable, idSucursal);

    }

    public Long count() {
        return productoRepository.count();
    }

    public Page<Producto> findByPorudctosEan(Pageable pageable, String productosEan) {
        return productoRepository.findById_ProductosEan(pageable, productosEan);
    }

    public Producto createProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Transactional
    public Producto updateProducto(Producto producto,
                                   Integer idComercio,
                                   Integer idBandera,
                                   Integer idSucursal,
                                   String productosEan,
                                   Long idProducto

    ) {
        ProductoId productoId = new ProductoId(idComercio, idBandera, idSucursal, productosEan, idProducto);
        Optional<Producto> existingProducto = productoRepository.findById(productoId);

        if (existingProducto.isPresent()) {
            Producto productoToUpdate = existingProducto.get();

            productoToUpdate.setId(productoId);
            productoToUpdate.setProductosDescripcion(producto.getProductosDescripcion());
            productoToUpdate.setProductosCantidadPresentacion(producto.getProductosCantidadPresentacion());
            productoToUpdate.setProductosUnidadMedidaPresente(producto.getProductosUnidadMedidaPresente());
            productoToUpdate.setProductosMarca(producto.getProductosMarca());
            productoToUpdate.setProductosPrecioLista(producto.getProductosPrecioLista());
            productoToUpdate.setProductosPrecioReferencia(producto.getProductosPrecioReferencia());
            productoToUpdate.setProductosCantidadReferencia(producto.getProductosCantidadReferencia());
            productoToUpdate.setProductosUnidadMedidaReferencia(producto.getProductosUnidadMedidaReferencia());
            productoToUpdate.setProductosPrecioUnitarioPromo1(producto.getProductosPrecioUnitarioPromo1());
            productoToUpdate.setProductosLeyendaPromo1(producto.getProductosLeyendaPromo1());
            productoToUpdate.setProductosPrecioUnitarioPromo2(producto.getProductosPrecioUnitarioPromo2());
            productoToUpdate.setProductosLeyendaPromo2(producto.getProductosLeyendaPromo2());

            productoRepository.save(productoToUpdate);

            return productoToUpdate;

        } else {
            throw new ProductoNotFoundException(productoId.toString());
        }

    }

    @Transactional
    public void deleteProducto(Integer idComercio,
                               Integer idBandera,
                               Integer idSucursal,
                               String productosEan,
                               Long idProducto

    ) {
        ProductoId productoId = new ProductoId(idComercio, idBandera, idSucursal, productosEan, idProducto);
        if (!productoRepository.existsById(productoId)) {
            throw new ProductoNotFoundException(productoId.toString());
        }

        productoRepository.deleteById(productoId);
    }

    public Page<Producto> findByProductosDescripcion(Pageable pageable, String productosDescripcion) {
        return productoRepository.findByProductosDescripcionContainingIgnoreCase(pageable, productosDescripcion);
    }

    public Page<Producto> findByPrecioListaBetween(Pageable pageable, BigDecimal min, BigDecimal max) {
        return productoRepository.findByProductosPrecioListaBetween(pageable, min, max);
    }

    public Page<Producto> findByPrecioListaLessThan(Pageable pageable, BigDecimal max) {
        return productoRepository.findByProductosPrecioListaLessThanEqual(pageable, max);
    }

    public Page<Producto> findByOrderByProductosPrecioListaDesc(Pageable pageable) {
        return productoRepository.findByOrderByProductosPrecioListaDesc(pageable);
    }

    public Page<Producto> findByOrderByProductosPrecioListaAsc(Pageable pageable) {
        return productoRepository.findByOrderByProductosPrecioListaAsc(pageable);
    }

}
