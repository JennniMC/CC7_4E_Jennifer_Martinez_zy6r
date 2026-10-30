package utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utez.edu.mx.zy6r_4E_Jennifer_Martinez_CC7.model.prestamo.Prestamo;

import java.util.Optional;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    //ptional<Prestamo> findById(Long id);
}
