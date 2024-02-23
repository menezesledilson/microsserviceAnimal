package com.ebac.animalservice.repositorios;

import com.ebac.animalservice.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a from Animal  a where  a.dataAdocao IS NULL ORDER BY  a.dataEntrada  ")
List<Animal> findNotAdopted();

    @Query("SELECT a from Animal  a where  a.dataAdocao IS NOT null  ")
    List<Animal> findAdopted();


    @Query("SELECT a.nomeRecebedor, COUNT(a) FROM Animal a WHERE a.dataEntrada BETWEEN :startDate AND :endDate GROUP BY a.nomeRecebedor")
    List<Object[]> contagemAnimal(LocalDate startDate, LocalDate endDate);

}
