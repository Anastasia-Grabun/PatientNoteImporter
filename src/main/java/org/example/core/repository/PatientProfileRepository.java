package org.example.core.repository;

import org.example.core.entity.PatientProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PatientProfileRepository extends JpaRepository<PatientProfile, Long> {

    List<PatientProfile> findByStatusIdIn(List<Integer> statusIds);

}
