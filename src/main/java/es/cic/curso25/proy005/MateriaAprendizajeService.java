package es.cic.curso25.proy005;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //Indica que es un archivo de lógica
@Transactional //Indica que los metodos se van a ejecutar en una transacción en caso de que salga mal hace rollback
public class MateriaAprendizajeService {
    private long id=1;

    public long create(MateriaAprendizaje materiaAprendizaje){
        return ++id;
    }

    
}
