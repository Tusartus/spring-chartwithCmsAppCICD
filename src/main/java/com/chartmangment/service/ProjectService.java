package com.chartmangment.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chartmangment.dao.ProjectRepository;
import com.chartmangment.dto.ChartData;
import com.chartmangment.dto.TimeChartData;
import com.chartmangment.entities.Project;



@Service
public class ProjectService {
	

	@Autowired
	ProjectRepository proRepo;
	
	
	public Project save(Project project) {
		return proRepo.save(project);
	}


	public List<Project> getAll() {
		return proRepo.findAll();
	}
	
	public List<ChartData> getProjectStatus(){
		return proRepo.getProjectStatus();
	}
	
	
	public List<TimeChartData> getTimeData(){
		return proRepo.getTimeData();
	}
	
	

}
