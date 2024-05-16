package laboratorio.Empleados.Repositorios;

import laboratorio.Empleados.Entidades.Empleado;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}


