package com.sebrus.precios_sepa.sucursal;

import com.sebrus.precios_sepa.comercio.Comercio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sucursal")
public class SucursalController {

    private final SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    @GetMapping("/{id}")
    public Sucursal findById(@PathVariable Integer id) {
        return sucursalService.findById(id);
    }

    @GetMapping("")
    public List<Sucursal> findAll() {
        return sucursalService.findAll();
    }

    @GetMapping("/bandera/{idBandera}")
    public ResponseEntity<Page<Sucursal>> findByIdBandera(
            @PathVariable Integer idBandera,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Sucursal> sucursales = sucursalService.findByIdBandera(pageable, idBandera);
        return ResponseEntity.status(HttpStatus.OK).body(sucursales);
    }

    @GetMapping("/comercio/{idComercio}")
    public ResponseEntity<Page<Sucursal>> findByIdComercio(
            @PathVariable Integer idComercio,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Sucursal> sucursales = sucursalService.findByIdComercio(pageable, idComercio);
        return ResponseEntity.status(HttpStatus.OK).body(sucursales);
    }

    @GetMapping("/localidad/{localidad}")
    public ResponseEntity<Page<Sucursal>> findByLocalidad(
            @PathVariable String localidad,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Sucursal> sucursales = sucursalService.findBySucursalesLocalidad(pageable, localidad);
        return ResponseEntity.status(HttpStatus.OK).body(sucursales);
    }

    @GetMapping("/barrio/{barrio}")
    public ResponseEntity<Page<Sucursal>> findByBarrio(
            @PathVariable String barrio,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Sucursal> sucursales = sucursalService.findBySucursalesBarrio(pageable, barrio);
        return ResponseEntity.status(HttpStatus.OK).body(sucursales);
    }

    @PostMapping()
    public ResponseEntity<Sucursal> addSucursal(@RequestBody Sucursal sucursal) {
        sucursalService.addSucursal(sucursal);
        return ResponseEntity.status(HttpStatus.CREATED).body(sucursal);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSucursal(@PathVariable Integer id) {
        sucursalService.deleteSucursal(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sucursal> updgradeSucursal(@RequestBody Sucursal sucursal, @PathVariable Integer id) {
        Sucursal sucursalUpdated = sucursalService.updateSucursal(sucursal, id);
        return ResponseEntity.status(HttpStatus.OK).body(sucursalUpdated);
    }

    @GetMapping("/count")
    public Long count() {
        return sucursalService.count();
    }
}
