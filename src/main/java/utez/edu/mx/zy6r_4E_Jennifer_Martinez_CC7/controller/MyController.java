package utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.model.prestamo.Prestamo;
import utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.service.MyService;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/api/videojuego")
public class MyController {
    private final MyService myService;
    public MyController(MyService myService){
        this.myService=myService;
    }
    @PostMapping
    public ResponseEntity <Prestamo>RegistrarPrestamo  @RequestBody(@PathVariable Long id){
        return  ResponseEntity.status(200).body(myService.get)
    }
}
