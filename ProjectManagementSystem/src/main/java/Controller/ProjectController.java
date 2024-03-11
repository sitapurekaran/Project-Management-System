package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import model.Project;
import service.ProjectService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    
    @GetMapping("/projects")
    public List<Project> getAllProjects() {
        return this.projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public Optional<Project> getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @PostMapping("/projects")
    public Project create(@RequestBody Project project) {
        return this.projectService.create(project);
    }

    @PutMapping("/projects")
    public Project updateProject(@RequestBody Project project, @PathVariable long id) {
        project.setId(id);
        return this.projectService.UpdateProject(project);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable long id) {
        this.projectService.deleteProject(id);
    }
}

