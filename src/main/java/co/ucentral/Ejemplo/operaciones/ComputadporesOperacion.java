package co.ucentral.Ejemplo.operaciones;

import co.ucentral.Ejemplo.entidades.ComputadoresEntidad;

import java.util.List;

public interface ComputadporesOperacion {
    public ComputadoresEntidad crear (ComputadoresEntidad computadores);
    public List<ComputadoresEntidad> consultar();
}
