package es.cic.curso25.proy005.controller;

import java.security.SecureRandom;
import java.text.ParseException;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic.curso25.proy005.model.Motor;
import es.cic.curso25.proy005.service.MotorService;

@RestController
@RequestMapping("/motor")
public class MotorController {
    private final static Logger LOGGER = LoggerFactory.getLogger(MotorController.class);

    @Autowired
    private MotorService motorService;

    @PostMapping
    public long create(Motor motor) {
        try {
            if (motor.getId() != null) {
                throw new RuntimeException("Al crear no me puedes pasar id");
            }
            this.motorService = null;
        } catch (RuntimeException re) {
            // LOGGER.error(re.getMessage());
            // re.printStackTrace();
            throw new MotorException("Ha fallado el motor al crear", re);
        }
        return motorService.create(motor);
    }
}
