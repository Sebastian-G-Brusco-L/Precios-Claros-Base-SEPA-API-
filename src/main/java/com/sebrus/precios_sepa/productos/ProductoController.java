package com.sebrus.precios_sepa.productos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    private final ProductoService productoService;

    //TODO:
    // paginacion a id comercio y id bandera


    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Page<Producto>> findByIdProducto(
            @PathVariable Long id,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Producto> productos = productoService.findByIdProducto(pageable, id);
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/sucursal/{idSucursal}")
    public ResponseEntity<Page<Producto>> findByIdSucursal(
            @PathVariable Integer idSucursal,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Producto> productos = productoService.findByIdSucursal(pageable, idSucursal);
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/comercio/{idComercio}")
    public ResponseEntity<Page<Producto>> findByIdComercio(
            @PathVariable Integer idComercio,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Producto> productos = productoService.findByIdComercio(pageable, idComercio);
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/bandera/{idBandera}")
    public ResponseEntity<Page<Producto>> findByIdBandera(
            @PathVariable Integer idBandera,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Producto> productos = productoService.findByIdBandera(pageable, idBandera);
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/count")
    public Long count() {
        return productoService.count();
    }

    @GetMapping("ean/{productoEan}")
    public ResponseEntity<Page<Producto>> findByProductoEan(
            @PathVariable String productoEan,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Producto> productos = productoService.findByPorudctosEan(pageable, productoEan);
        return ResponseEntity.ok(productos);
    }

    @PostMapping()
    public ResponseEntity<Producto> createProducto(@RequestBody Producto producto) {
        productoService.createProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(producto);
    }

    @PutMapping("/{idComercio}/{idBandera}/{idSucursal}/{productosEan}/{idProducto}")
    public ResponseEntity<Producto> updateProducto(@RequestBody Producto producto,
                                                   @PathVariable Integer idComercio,
                                                   @PathVariable Integer idBandera,
                                                   @PathVariable Integer idSucursal,
                                                   @PathVariable String productosEan,
                                                   @PathVariable Long idProducto

    ) {

        Producto productoUpdated = productoService.updateProducto(producto, idComercio, idBandera, idSucursal, productosEan, idProducto);
        return ResponseEntity.ok(productoUpdated);
    }

    @DeleteMapping("/{idComercio}/{idBandera}/{idSucursal}/{productosEan}/{idProducto}")
    public ResponseEntity<Void> deleteProducto(
            @PathVariable Integer idComercio,
            @PathVariable Integer idBandera,
            @PathVariable Integer idSucursal,
            @PathVariable Long idProducto,
            @PathVariable String productosEan

    ) {
        productoService.deleteProducto(idComercio, idBandera, idSucursal, productosEan, idProducto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/desc/{productosDescripcion}")
    public ResponseEntity<Page<Producto>> findByDescripcion(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @PathVariable String productosDescripcion
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Producto> productos = productoService.findByProductosDescripcion(pageable, productosDescripcion);
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/between/{min}/{max}")
    public ResponseEntity<Page<Producto>> findByPrecioListaBetween(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @PathVariable BigDecimal min,
            @PathVariable BigDecimal max
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Producto> productos = productoService.findByPrecioListaBetween(pageable, min, max);
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/lessthan/{max}")
    public ResponseEntity<Page<Producto>> finByPrecioListaLessThan(
            @PathVariable BigDecimal max,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Producto> productos = productoService.findByPrecioListaLessThan(pageable, max);
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/sort/precio-lista/desc")
    public ResponseEntity<Page<Producto>> findbyProductosSortByPrecioListaDesc(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Producto> productos = productoService.findByOrderByProductosPrecioListaDesc(pageable);
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/sort/precio-lista/asc")
    public ResponseEntity<Page<Producto>> findbyProductosSortByPrecioListaAsc(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Producto> productos = productoService.findByOrderByProductosPrecioListaAsc(pageable);
        return ResponseEntity.ok(productos);
    }


}
