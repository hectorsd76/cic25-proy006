package es.cic.curso25.proy005.service;

import org.springframework.stereotype.Service;

import es.cic.curso25.proy005.model.MateriaAprendizaje;

@Service //Indica que es un archivo de lógica
public class MateriaAprendizajeService {
    private long id=1;

    public long create(MateriaAprendizaje materiaAprendizaje){
        return ++id;
    }

    
}
