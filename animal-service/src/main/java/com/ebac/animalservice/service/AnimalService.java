package com.ebac.animalservice.service;

import com.ebac.animalservice.repositorios.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // Importação necessária

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service // Adição da anotação @Service para indicar que esta classe é um serviço gerenciado pelo Spring
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public Map<String, Integer> contagemAnimal(LocalDate startDate, LocalDate endDate) {
        List<Object[]> results = animalRepository.contagemAnimal(startDate, endDate);
        Map<String, Integer> counts = new HashMap<>();
        for (Object[] result : results) {
            String employeeName = (String) result[0];
            Long count = (Long) result[1];
            counts.put(employeeName, count.intValue());
        }
        return counts;
    }
}
