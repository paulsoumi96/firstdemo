package com.mindtree.RegistrationForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.RegistrationForm.entity.Form;
@Repository
public interface FormRepository extends JpaRepository<Form,Long>{
}
