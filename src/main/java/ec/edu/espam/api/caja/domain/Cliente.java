package ec.edu.espam.api.caja.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Getter
@Setter
@Entity(name = "cliente")

public class Cliente extends Persona {
    @Column(name = "clave")
    @NotEmpty(message = "Clave es requerida")
    @Size(min = 4, message = "Clave debe contener al menos 4 caracteres")
    private String clave;

    @Column(name = "estado")
    @NotNull(message = "Estado es requerido")
    private Boolean estado;
}
