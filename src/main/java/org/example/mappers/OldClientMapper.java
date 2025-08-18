package org.example.mappers;

import org.example.core.entity.old.Client;
import org.example.dto.OldClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OldClientMapper {

    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
/*    @Mapping(source = "patient.status", target = "status", qualifiedByName = "toStatus")*/
    @Mapping(source = "dob", target = "dob")
    @Mapping(source = "createdAt", target = "createdDateTime")
    OldClientDto toDto(Client entity);

   /* @Named("toStatus")
    default String toStatus(PatientStatus status) {
        return status.getStatus();
    }
*/
}
