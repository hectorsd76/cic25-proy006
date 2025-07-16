package es.cic.curso25.proy005.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.curso25.proy005.model.Telefono;

@RestController
@RequestMapping("/telefono")
public class TelefonoController {

    private int contador;

    // CRUD

    @PostMapping
    public long create(@RequestBody Telefono telefono){

        return ++contador;

    }

    @GetMapping
    public List<Telefono> get() {

        List<Telefono> resultado = new ArrayList<>();
        Telefono telefono1 = new Telefono(1, "Marcos", "5555555", 1);
        resultado.add(telefono1);
        Telefono telefono2 = new Telefono(2, "Juan", "55566666", 1);

        resultado.add(telefono2);

        return resultado;
    }

    @GetMapping("/{id}")
    public Telefono get(@PathVariable long id) {

        List<Telefono> resultado = new ArrayList<>();
        Telefono telefono1 = new Telefono(1, "Marcos", "5555555", 1);
        resultado.add(telefono1);
      

        return telefono1;
    }

    @PutMapping
    public void update(@RequestBody Telefono telefono){
        throw new UnsupportedOperationException();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        contador=contador;
    }

}
