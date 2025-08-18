package org.example.core.service;

import lombok.RequiredArgsConstructor;
import org.example.core.entity.old.Client;
import org.example.core.entity.old.ClientNote;
import org.example.core.exception.ClientNotFoundException;
import org.example.core.repository.ClientNoteRepository;
import org.example.core.repository.ClientRepository;
import org.example.dto.ClientNotesResponseDto;
import org.example.dto.ClientNotesRequestDto;
import org.example.mappers.ClientNoteMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientNoteService {

    private final ClientNoteRepository clientNoteRepository;
    private final ClientRepository clientRepository;
    private final ClientNoteMapper clientNoteMapper;

    public List<ClientNotesResponseDto> getClientNotes(ClientNotesRequestDto requestDto) {
        Client client = clientRepository.findByGuidAndAgency(
                requestDto.getClientGuid(),
                requestDto.getAgency()
        ).orElseThrow(() -> new ClientNotFoundException("Client not found"));

        List<ClientNote> notes = clientNoteRepository.findByClientAndCreatedDateTimeBetween(
                client,
                requestDto.getDateFrom().atStartOfDay(),
                requestDto.getDateTo().atTime(23, 59, 59)
        );

        return clientNoteMapper.toDtoList(notes);
    }

}

