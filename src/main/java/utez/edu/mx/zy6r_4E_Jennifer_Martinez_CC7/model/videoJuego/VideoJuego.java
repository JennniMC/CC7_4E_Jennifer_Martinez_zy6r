package utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.model.videoJuego;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Videojuego")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VideoJuego {
    //id
    //titulo
    //plataforma
    //disponible (boolean)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String plataforma;

    private boolean disponible;

}
