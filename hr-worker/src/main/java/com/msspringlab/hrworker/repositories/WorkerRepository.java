package com.msspringlab.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.msspringlab.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
