package org.example.core.repository;

import org.example.core.entity.old.Client;
import org.example.core.entity.old.ClientNote;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface ClientNoteRepository extends JpaRepository<ClientNote, Long> {

    List<ClientNote> findByClientAndCreatedDateTimeBetween(
            Client client, LocalDateTime start, LocalDateTime end
    );

}
