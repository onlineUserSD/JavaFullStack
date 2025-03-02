package com.saad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saad.model.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, String> {

}
