package com.nexus.logic.springboot_rest_jpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexus.logic.springboot_rest_jpa.model.JobPost;

public interface JobPostRepo extends JpaRepository<JobPost ,Integer>{

	List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyword, String keyword2);

	List<JobPost> findByReqExperience(int year);

}
