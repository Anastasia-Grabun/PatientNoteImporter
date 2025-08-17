package org.example.core.repository;

import org.example.core.entity.PatientOldClient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PatientOldClientRepository extends JpaRepository<PatientOldClient, Long> {

    Optional<PatientOldClient> findByGuid(String guid);

}
