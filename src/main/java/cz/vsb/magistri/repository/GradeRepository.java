package cz.vsb.magistri.repository;

import cz.vsb.magistri.entity.GradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<GradeEntity, Integer> {

}
