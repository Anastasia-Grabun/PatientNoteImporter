package org.example.core.repository;

import org.example.core.entity.old.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findByGuid(UUID guid);

    Optional<Client> findByGuidAndAgency(UUID clientGuid, String agency);

}
