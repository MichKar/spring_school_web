package cz.vsb.magistri.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDto {
    Integer id;
    String name;
}

