package com.sebrus.precios_sepa.sucursal;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalService {

    private final SucursalRepository sucursalRepository;

    public SucursalService(SucursalRepository sucursalRepository) {
        this.sucursalRepository = sucursalRepository;
    }

    public Sucursal findById(Integer id) {
        return sucursalRepository.findById(id).orElseThrow(() -> new SucursalNotFoundException(id));
    }

    public List<Sucursal> findAll() {
        return sucursalRepository.findAll();
    }

    public Page<Sucursal> findByIdBandera(Pageable pageable, Integer idBandera) {
        return sucursalRepository.findByIdBandera(pageable,idBandera);
    }

    public Page<Sucursal> findByIdComercio(Pageable pageable,Integer idSucursal) {
        return sucursalRepository.findByIdComercio(pageable,idSucursal);
    }

    public Page<Sucursal> findBySucursalesLocalidad(Pageable pageable,String localidad) {
        return sucursalRepository.findBySucursalesLocalidadContainingIgnoreCase(pageable,localidad);
    }

    public Page<Sucursal> findBySucursalesBarrio(Pageable pageable,String barrio) {
        return sucursalRepository.findBySucursalesBarrioContainingIgnoreCase(pageable,barrio);
    }

    public Sucursal addSucursal(Sucursal sucursal) {
        sucursalRepository.save(sucursal);
        return sucursal;
    }

    @Transactional
    public void deleteSucursal(Integer id) {

        if (!sucursalRepository.existsById(id)) {
            throw new SucursalNotFoundException(id);
        }
        sucursalRepository.deleteById(id);
    }

    @Transactional
    public Sucursal updateSucursal(Sucursal sucursal, Integer id) {
        Optional<Sucursal> existingSucursal = sucursalRepository.findById(id);

        if (existingSucursal.isPresent()) {
            Sucursal sucursalToUpdate = existingSucursal.get();

            sucursalToUpdate.setIdSucursal(sucursal.getIdSucursal());
            sucursalToUpdate.setIdBandera(sucursal.getIdBandera());
            sucursalToUpdate.setIdComercio(sucursal.getIdComercio());
            sucursalToUpdate.setSucursalesNombre(sucursal.getSucursalesNombre());
            sucursalToUpdate.setSucursalesTipo(sucursal.getSucursalesTipo());
            sucursalToUpdate.setSucursalesCalle(sucursal.getSucursalesCalle());
            sucursalToUpdate.setSucursalesNombre(sucursal.getSucursalesNombre());
            sucursalToUpdate.setSucursalesLatitud(sucursal.getSucursalesLatitud());
            sucursalToUpdate.setSucursalesLongitud(sucursal.getSucursalesLongitud());
            sucursalToUpdate.setSucursalesObservaciones(sucursal.getSucursalesObservaciones());
            sucursalToUpdate.setSucursalesBarrio(sucursal.getSucursalesBarrio());
            sucursalToUpdate.setSucursalesCodigoPostal(sucursal.getSucursalesCodigoPostal());
            sucursalToUpdate.setSucursalesLocalidad(sucursal.getSucursalesLocalidad());
            sucursalToUpdate.setSucursalesProvincia(sucursal.getSucursalesProvincia());
            sucursalToUpdate.setSucursalesLunesHorarioAtencion(sucursal.getSucursalesLunesHorarioAtencion());
            sucursalToUpdate.setSucursalesMartesHorarioAtencion(sucursal.getSucursalesMartesHorarioAtencion());
            sucursalToUpdate.setSucursalesMiercolesHorarioAtencion(sucursal.getSucursalesMiercolesHorarioAtencion());
            sucursalToUpdate.setSucursalesJuevesHorarioAtencion(sucursal.getSucursalesJuevesHorarioAtencion());
            sucursalToUpdate.setSucursalesViernesHorarioAtencion(sucursal.getSucursalesViernesHorarioAtencion());
            sucursalToUpdate.setSucursalesSabadoHorarioAtencion(sucursal.getSucursalesSabadoHorarioAtencion());
            sucursalToUpdate.setSucursalesDomingoHorarioAtencion(sucursal.getSucursalesDomingoHorarioAtencion());

            sucursalRepository.save(sucursalToUpdate);

            return sucursalToUpdate;


        } else {
            throw new SucursalNotFoundException(id);
        }

    }

    public long count(){
        return sucursalRepository.count();
    }

}
