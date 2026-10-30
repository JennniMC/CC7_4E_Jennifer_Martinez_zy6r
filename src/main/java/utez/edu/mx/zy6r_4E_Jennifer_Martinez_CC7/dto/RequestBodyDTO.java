package utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestBodyDTO {
    @NotBlank
    private String nombreSolicitante;
    @NotBlank
    private String titulo;
    @NotBlank
    private String plataforma;
     @NotBlank
    private boolean disponible;
}
