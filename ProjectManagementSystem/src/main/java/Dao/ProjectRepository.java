package Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

import model.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
