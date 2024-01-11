package ec.edu.espam.api.caja.repository;
import ec.edu.espam.api.caja.domain.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface  MovimientoRepositorio extends JpaRepository<Movimiento, Long> {
}
