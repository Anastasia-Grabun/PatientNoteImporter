package org.example.rest;

import lombok.RequiredArgsConstructor;
import org.example.core.service.ClientNoteService;
import org.example.core.service.ClientService;
import org.example.dto.ClientNotesResponseDto;
import org.example.dto.ClientNotesRequestDto;
import org.example.dto.OldClientDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class OldSystemController {

    private final ClientService oldClientService;
    private final ClientNoteService clientNoteService;

    @PostMapping("/clients")
    public List<OldClientDto> getAllClients() {
        return oldClientService.getAllClients();
    }

    @PostMapping("/notes")
    public List<ClientNotesResponseDto> getClientNotes(@RequestBody ClientNotesRequestDto requestDto) {
        return clientNoteService.getClientNotes(requestDto);
    }

}

