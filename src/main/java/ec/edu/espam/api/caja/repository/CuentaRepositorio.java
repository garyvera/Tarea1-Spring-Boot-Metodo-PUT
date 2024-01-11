package ec.edu.espam.api.caja.repository;
import ec.edu.espam.api.caja.domain.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepositorio extends JpaRepository<Cuenta, Long> {
}
