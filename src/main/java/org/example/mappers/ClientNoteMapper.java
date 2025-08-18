package org.example.mappers;

import org.example.core.entity.old.ClientNote;
import org.example.dto.ClientNotesResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientNoteMapper {

    @Mapping(source = "note.client.guid", target = "clientGuid")
    @Mapping(source = "note.createdBy.login", target = "loggedUser")
    @Mapping(source = "note.comments", target = "comments")
    @Mapping(source = "note.guid", target = "guid")
    @Mapping(source = "note.createdDateTime", target = "createdDateTime")
    @Mapping(source = "note.modifiedDateTime", target = "modifiedDateTime")
    @Mapping(source = "note.createdDateTime", target = "datetime")
    ClientNotesResponseDto toDto(ClientNote note);

    List<ClientNotesResponseDto> toDtoList(List<ClientNote> notes);

    default ZonedDateTime map(LocalDateTime value) {
        return value == null ? null : value.atZone(ZoneId.systemDefault());
    }

}
