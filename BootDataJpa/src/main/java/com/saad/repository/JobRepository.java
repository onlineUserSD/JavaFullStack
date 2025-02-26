package com.saad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saad.model.Job;
@Repository 
public interface JobRepository extends JpaRepository<Job, String> {

}
