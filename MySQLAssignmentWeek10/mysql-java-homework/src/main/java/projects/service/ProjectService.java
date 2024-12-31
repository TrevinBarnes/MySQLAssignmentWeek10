package projects.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

import projects.dao.ProjectDao;
import projects.entity.Project;


@SuppressWarnings("unused")
public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();
	
	public Project addProject(Project projects) {
		return projectDao.insertProjects(projects);
	}

	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}
	
	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException(
				"Project with project ID="+ projectId + " does not exist."));
	}
}
