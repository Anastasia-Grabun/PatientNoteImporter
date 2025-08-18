package org.example.core.service;

import lombok.RequiredArgsConstructor;
import org.example.core.repository.ClientRepository;
import org.example.dto.OldClientDto;
import org.example.mappers.OldClientMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;
    private final OldClientMapper mapper;

    public List<OldClientDto> getAllClients() {
        return clientRepository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

}
