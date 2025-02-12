package com.sebrus.precios_sepa.comercio;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ComercioService {
    private final ComercioRepository comercioRepository;
    private static final Logger log = LoggerFactory.getLogger(ComercioService.class);


    public ComercioService(ComercioRepository comercioRepository) {
        this.comercioRepository = comercioRepository;
    }

    public Comercio findById(Integer id) {
        return comercioRepository.findById(id).orElseThrow(() -> {
            log.error("Comercio no encontrado con id: {}", id);
            return new ComercioNotFoundException(id);
        });
    }

    public List<Comercio> findAll() {
        return comercioRepository.findAll();
    }

    public Page<Comercio> findByIdBandera(Pageable pageable, Integer idBandera) {
        return comercioRepository.findByIdBandera(pageable, idBandera);
    }

    public Comercio findByCuit(String idCuit) {
        return comercioRepository.findByComercioCuit(idCuit).orElseThrow(() -> new ComercioNotFoundException(Integer.parseInt(idCuit)));
    }

    //update
    @Transactional
    public Comercio update(Comercio comercio, Integer id) {

        Optional<Comercio> existingComercio = comercioRepository.findById(id);
        if (existingComercio.isPresent()) {
            Comercio comercioToUpdate = existingComercio.get();
            comercioToUpdate.setIdComercio(comercio.getIdComercio());
            comercioToUpdate.setIdBandera(comercio.getIdBandera());
            comercioToUpdate.setComercioCuit(comercio.getComercioCuit());
            comercioToUpdate.setComercioBanderaNombre(comercio.getComercioBanderaNombre());
            comercioToUpdate.setComercioBanderaUrl(comercio.getComercioBanderaUrl());
            comercioToUpdate.setComercioRazonSocial(comercio.getComercioRazonSocial());
            comercioToUpdate.setComercioUltimaActualizacion(comercio.getComercioUltimaActualizacion());
            comercioToUpdate.setComercioVersionSepa(comercio.getComercioVersionSepa());

            comercioRepository.save(comercioToUpdate);

            return comercioToUpdate;

        } else {
            throw new ComercioNotFoundException(id);
        }

    }

    //post
    public Comercio create(Comercio comercio) {
        comercioRepository.save(comercio);
        return comercio;
    }

    public Long count() {
        return comercioRepository.count();
    }

    //delete
    @Transactional
    public void delete(Integer id) {

        if (!comercioRepository.existsById(id)) {
            throw new ComercioNotFoundException(id);
        }
        comercioRepository.deleteById(id);

    }
}
