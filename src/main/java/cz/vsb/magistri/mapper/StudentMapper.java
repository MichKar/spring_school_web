package cz.vsb.magistri.mapper;

import cz.vsb.magistri.dto.StudentDto;
import cz.vsb.magistri.entity.StudentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentEntity toEntity(StudentDto studentDto);
    StudentDto toDto(StudentEntity entity);

}
