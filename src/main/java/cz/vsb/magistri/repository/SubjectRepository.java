package cz.vsb.magistri.repository;

import cz.vsb.magistri.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Integer> {
    Optional<SubjectEntity> findByName(String name);
}