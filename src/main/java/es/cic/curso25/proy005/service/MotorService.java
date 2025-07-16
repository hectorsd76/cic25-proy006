package es.cic.curso25.proy005.service;

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

        return motorRepository.create(motor);
    }
}
