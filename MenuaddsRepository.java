package com.codesample.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesample.project.data.Menuadds;

@Repository
public interface MenuaddsRepository extends JpaRepository<Menuadds, String>{

}
