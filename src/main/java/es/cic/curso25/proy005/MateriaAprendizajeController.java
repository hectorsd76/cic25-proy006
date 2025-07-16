package es.cic.curso25.proy005;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica que es una clase  controlador REST maneja peticiones HTTP
@RequestMapping("/materia") // Define ruta URL

public class MateriaAprendizajeController {
    @Autowired //inyecta elemento creado mediante Spring en este ejemplo service
    private MateriaAprendizajeService materiaAprendizajeService;

    @PostMapping //peticiones HTTP POST. para crear nuevos recursos
    public long create (@RequestBody MateriaAprendizaje materiaAprendizaje){
        long id = materiaAprendizajeService.create(materiaAprendizaje);
        return id;

    }

    @GetMapping // Se usa para obtener datos de lectura .
    public List<MateriaAprendizaje> get(){
        List<MateriaAprendizaje> resultado= new ArrayList<>();
        MateriaAprendizaje materia1= new MateriaAprendizaje(1, "variables", true);
        
        resultado.add(materia1);

        MateriaAprendizaje materia2= new MateriaAprendizaje(2, "funciones", false);

        resultado.add(materia2);

        return resultado;
    }

    @GetMapping("/{id}")
    public MateriaAprendizaje get(@PathVariable long id) {
        MateriaAprendizaje materia1= new MateriaAprendizaje(1, "variables", true);
        return materia1;
    }

    
    





}
