package unimagdalena.edu.demo.controlers;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import unimagdalena.edu.demo.dto.Estudiante;

@RestController
public class EstudianteApi {
    @GetMapping("/estudiantes")
    public ResponseEntity<List<Estudiante>> getEstudiantes(){

    }
}
