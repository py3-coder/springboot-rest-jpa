package com.nexus.logic.springboot_rest_jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexus.logic.springboot_rest_jpa.model.JobPost;
import com.nexus.logic.springboot_rest_jpa.repo.JobPostRepo;


@Service
public class JobPostService {

	@Autowired
	private JobPostRepo repo ;
	public List<JobPost> getAllJobs() {
		return repo.findAll();
	}
	public JobPost getJobById(int id) {
		Optional<JobPost> ss =repo.findById(id);
		return ss.orElse(null);
	}
	public void addJob(JobPost jobpost) {
		repo.save(jobpost);
	}
	public void updateJob(JobPost jobpost) {
		repo.save(jobpost);
	}
	public void deleteJob(int id) {
		repo.deleteById(id);
	}
	public List<JobPost> searchJob(String keyword) {
		// TODO Auto-generated method stub
		return repo.findByPostProfileContainingOrPostDescContaining(keyword ,keyword);
	}
	public List<JobPost> findByReqExperience(int year) {
		return repo.findByReqExperience(year);
	}

}
