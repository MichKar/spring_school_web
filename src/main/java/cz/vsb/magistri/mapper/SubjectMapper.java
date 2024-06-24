package cz.vsb.magistri.mapper;

import cz.vsb.magistri.dto.SubjectDto;
import cz.vsb.magistri.entity.SubjectEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubjectMapper {
    SubjectEntity toEntity(SubjectDto subjectDto);
    SubjectDto toDto(SubjectEntity entity);

}