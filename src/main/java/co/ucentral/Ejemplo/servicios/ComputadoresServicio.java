package co.ucentral.Ejemplo.servicios;

import co.ucentral.Ejemplo.entidades.ComputadoresEntidad;
import co.ucentral.Ejemplo.operaciones.ComputadporesOperacion;
import co.ucentral.Ejemplo.repositorios.ComputadoresRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputadoresServicio implements ComputadporesOperacion {
    @Autowired
    ComputadoresRepositorio ComputadoresRepositorio;

    @Override
    public ComputadoresEntidad crear(ComputadoresEntidad computadores) {
        return  ComputadoresRepositorio.save(computadores);
    }


    @Override
    public List<ComputadoresEntidad> consultar() {
        return ComputadoresRepositorio.findAll();
    }
}
