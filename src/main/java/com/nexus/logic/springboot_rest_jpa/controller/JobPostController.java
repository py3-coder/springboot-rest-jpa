package com.nexus.logic.springboot_rest_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nexus.logic.springboot_rest_jpa.model.JobPost;
import com.nexus.logic.springboot_rest_jpa.service.JobPostService;



@RestController
public class JobPostController {

	
	@Autowired
	public JobPostService service;
	
	@GetMapping("/jobPosts")
	public List<JobPost> getAllJobs() {
		return service.getAllJobs();
	}
	
	@GetMapping("/jobPost/{id}")
	public JobPost getJobById(@PathVariable("id") int id) {
		return service.getJobById(id);
	}
	
	@PostMapping("/jobPost")
	public JobPost addJob(@RequestBody JobPost jobpost) {
		 service.addJob(jobpost);
		 return service.getJobById(jobpost.getPostId());
	}
	
	@PutMapping("/update/jobPost")
	public JobPost updateJob(@RequestBody JobPost jobpost) {
		 service.updateJob(jobpost);
		 return service.getJobById(jobpost.getPostId());
		
	}
	
	@DeleteMapping("/delete/jobPost/{id}")
	public JobPost deleteJob(@PathVariable("id") int id) {
		JobPost jp = service.getJobById(id);
		service.deleteJob(id);
		return jp;
	}
	
	
	@GetMapping("/search/jobPost/{keyword}")
	public List<JobPost> searchJob(@PathVariable("keyword") String keyword){
		return service.searchJob(keyword);
	}
	
	@GetMapping("/search/jobPost/yoe/{year}")
	public List<JobPost> searchJobByReqExperience(@PathVariable("year") int year){
		return service.findByReqExperience(year);
	}
	
	
}
