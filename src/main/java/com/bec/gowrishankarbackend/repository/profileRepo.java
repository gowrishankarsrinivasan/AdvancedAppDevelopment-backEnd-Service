package com.bec.gowrishankarbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bec.gowrishankarbackend.model.Profile;

public interface profileRepo extends JpaRepository<Profile, String> {

}
