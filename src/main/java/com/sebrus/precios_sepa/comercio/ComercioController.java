package com.sebrus.precios_sepa.comercio;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/comercio")
public class ComercioController {
    private final ComercioService comercioService;

    public ComercioController(ComercioService comercioService) {
        this.comercioService = comercioService;
    }

    @GetMapping("/{id}")
    public Comercio findById(@PathVariable Integer id) {
        return comercioService.findById(id);
    }

    @GetMapping("/bandera/{idBandera}")
    public ResponseEntity<Page<Comercio>> findByIdBandera(
            @PathVariable Integer idBandera,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Comercio> comercios = comercioService.findByIdBandera(pageable, idBandera);
        return ResponseEntity.status(HttpStatus.OK).body(comercios);
    }

    @GetMapping("/cuit/{idCuit}")
    public ResponseEntity<Comercio> findByCuit(@PathVariable String idCuit) {
        Comercio comercio = comercioService.findByCuit(idCuit);
        return ResponseEntity.status(HttpStatus.OK).body(comercio);
    }

    @GetMapping("")
    public List<Comercio> findAll() {
        return comercioService.findAll();
    }

    @GetMapping("/count")
    public Long count() {
        return comercioService.count();
    }


    //put comercio
    @PutMapping("/{id}")
    public ResponseEntity<Comercio> update(@RequestBody Comercio comercio, @PathVariable Integer id) {
        Comercio comercioUpdated = comercioService.update(comercio, id);
        return ResponseEntity.status(HttpStatus.OK).body(comercioUpdated);
    }

    //post
    @PostMapping()
    public ResponseEntity<Comercio> add(@RequestBody Comercio comercio) {
        Comercio createdComercio = comercioService.create(comercio);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdComercio);
    }

    //delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        comercioService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
