package co.ucentral.Ejemplo.repositorios;

import co.ucentral.Ejemplo.entidades.ComputadoresEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ComputadoresRepositorio  extends JpaRepository<ComputadoresEntidad,Long>{



}
