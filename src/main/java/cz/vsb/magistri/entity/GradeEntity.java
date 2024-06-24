package cz.vsb.magistri.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity (name = "grade")
@Getter
@Setter
public class GradeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private StudentEntity student;
    @ManyToOne
    private SubjectEntity subject;
    private String topic;
    private int mark;
}
