package co.ucentral.Ejemplo.operaciones;

import co.ucentral.Ejemplo.entidades.ComputadoresEntidad;

import java.util.List;

public interface ComputadporesOperacion {
    public ComputadoresEntidad Crear (ComputadoresEntidad computadores);
    public List<ComputadoresEntidad> Consultar();
}
