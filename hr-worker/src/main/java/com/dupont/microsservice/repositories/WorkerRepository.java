package com.dupont.microsservice.repositories;

import com.dupont.microsservice.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
