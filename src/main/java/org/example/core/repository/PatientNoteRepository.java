package org.example.core.repository;

import org.example.core.entity.PatientNote;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PatientNoteRepository extends JpaRepository<PatientNote, Long> {

    Optional<PatientNote> findByExternalId(String externalId);

}
