package utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.service;

import io.swagger.v3.oas.models.parameters.RequestBody;
import org.springframework.stereotype.Service;
import utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.dto.RequestBodyDTO;
import utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.exception.CustomException;
import utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.model.prestamo.Prestamo;
import utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.model.videoJuego.VideoJuego;
import utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.repository.PrestamoRepository;
import utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.repository.VideojuegoRepository;

import java.util.Optional;

@Service
public class MyService {
    private final PrestamoRepository prestamoRepository;
    private final VideojuegoRepository videojuegoRepository;

    public MyService(PrestamoRepository prestamoRepository, VideojuegoRepository videojuegoRepository){
        this.prestamoRepository=prestamoRepository;
        this.videojuegoRepository=videojuegoRepository;

    }
    //Verificar que el videojuego exista
    public VideoJuego Very(Long id){
        return videojuegoRepository.findById(id).orElseThrow(()->new CustomException("El videojuego No exiaste"));
    }

    //Registrar Prestamo
    public Prestamo RegistrarPrestamo(Long id, String nombreSolicitante){
        Prestamo prestamo = new Prestamo();
        VideoJuego videoJuego=new VideoJuego();
       if(videojuegoRepository.existsById(id)){
           prestamo.setNombreSolicitante(prestamo.getNombreSolicitante());
           prestamo.setFechaPrestamo(prestamo.getFechaPrestamo());
           prestamo.setEstado(prestamo.getEstado());

       }else{
           new CustomException("El videojuego No exiaste");
       }
        return  prestamoRepository.save(prestamo);

    }

    //Registrar videojuego
    public VideoJuego RegistrarVideojuego(String titulo, String plataforma){
        VideoJuego videoJuego=new VideoJuego();
        if(titulo.isEmpty()||plataforma.isEmpty()){
          throw new RuntimeException("Por favor llena los campos");
        }else {

            videoJuego.setDisponible(true);
            videoJuego.setPlataforma(videoJuego.getPlataforma());
            videoJuego.setTitulo(videoJuego.toString());
        }
       return videojuegoRepository.save(videoJuego);

    }

    //cancelar prestamo
   /* public Prestamo CancelarPrestamo(Long id){
        Prestamo prestamo = new Prestamo();
        if(prestamoRepository.existsById(id)){

            if (prestamo.getEstado().equals("ACTIVO")) {
                prestamo.setEstado();


            }

        }
    }*/

}
