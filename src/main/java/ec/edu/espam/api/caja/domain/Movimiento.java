package ec.edu.espam.api.caja.domain;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "movimiento")

public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fecha")
    @NotNull(message = "Fecha es requerida")
    private LocalDate fecha;

    @Column(name = "tipo")
    @NotNull(message = "Tipo es requerido")
    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo;

    @Column(name = "monto")
    @NotNull(message = "Monto es requerido")
    private BigDecimal monto;

    @Column(name = "balance")
    @NotNull(message = "Balance es requerido")
    private BigDecimal balance;

    public enum TipoMovimiento {
        DEBITO, CREDITO;
    }
}
