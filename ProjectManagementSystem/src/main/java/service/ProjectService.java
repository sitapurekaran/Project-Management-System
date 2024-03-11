package service;

import java.util.List;
import java.util.Optional;

import model.Project;

public interface ProjectService {

    public  List<Project> getAllProjects();

    public Optional<Project> getProjectById(Long id);

    public Project create(Project project);
    public Project UpdateProject(Project project);

    public void deleteProject(Long id);
}
