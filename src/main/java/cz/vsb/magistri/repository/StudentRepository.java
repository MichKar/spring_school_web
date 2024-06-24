package cz.vsb.magistri.repository;

import cz.vsb.magistri.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
