package es.cic.curso25.proy005.repository;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import es.cic.curso25.proy005.model.Motor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class MotorRepositoryImpl {

    @PersistenceContext
    private EntityManager em;


    private Map<Long, Motor> motores = new HashMap<>();

    public long create(Motor motor) {
        em.persist(motor);

        return motor.getId();

        // long mayor = getSiguienteId();
        // motor.setId(mayor);
        // motores.put(motor.getId(), motor);
        // return motor.getId();
    }

    private long getSiguienteIdConStreams() {
        long mayor = 
            motores
                .keySet()
                .stream()
                .max(
                    (primero, segundo) -> (int) (segundo.longValue() - primero.longValue())
                ).get();
        return mayor + 1;        
    }



    private long getSiguienteId() {
        long mayor = 0;
        
        Set<Long> ids = motores.keySet();
        
        Iterator<Long> iteratorId =  ids.iterator();


        while (iteratorId.hasNext()) {
            Long siguiente = iteratorId.next();
            if (siguiente.longValue() > mayor) {
                mayor = siguiente;
            }
        }
        mayor++;
        return mayor;
    }
}
