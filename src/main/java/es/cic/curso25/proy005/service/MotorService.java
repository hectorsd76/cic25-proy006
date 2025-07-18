package es.cic.curso25.proy005.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cic.curso25.proy005.model.Motor;
import es.cic.curso25.proy005.repository.MotorRepository;

@Service
public class MotorService {
    @Autowired
    private MotorRepository motorRepository;


    public long create(Motor motor) {
        // Los días festivos y los fines de semana en esta empresa no se crean motores
        motorRepository.save(motor);

        return motor.getId();
    }

    public Motor get(long id) {
        Optional<Motor> resultado = motorRepository.findById(id);
        return resultado.orElse(null);
    }

    public List<Motor> get() {
        return motorRepository.findAll();
    }

    public void update(Motor motor) {
        motorRepository.save(motor);
    }

    public void delete(long id) {
        motorRepository.deleteById(id);
    }
}
