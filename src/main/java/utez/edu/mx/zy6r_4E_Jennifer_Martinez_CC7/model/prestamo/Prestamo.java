package utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.model.prestamo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.model.videoJuego.VideoJuego;

import java.sql.Date;

@Entity
@Table(name = "Prestamo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prestamo {
    //id
    //nombreSolicitante
    //fechaPrestamo
    //fechaDevolucion
    //estado (ACTIVO, DEVUELTO, CANCELADO)
    //videojuego (ManyToOne)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreSolicitante;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "videoJuego")
    private VideoJuego videoJuego;

}
