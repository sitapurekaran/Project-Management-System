package service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import Dao.ProjectRepository;
import Exception.ProjectNotFoundException;
import model.Project;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Optional<Project> getProjectById(Long id) {
        Optional <Project> projectObj = projectRepository.findById(id);
        if(!projectObj.isPresent()) {
        	throw new ProjectNotFoundException("project with id : "+id+" doesn't exist in DB ");
        	
        }
        return projectObj;
    }



    @Override
    public void deleteProject(Long id) { 
        Project project = projectRepository.getOne(id);
        projectRepository.delete(project);
    }

	@Override
	public Project create(Project project) {
		projectRepository.save(project);
		return project;
	}

	@Override
	public Project UpdateProject(Project project) {
		projectRepository.save(project);
		return project;
	}

	

	
}
