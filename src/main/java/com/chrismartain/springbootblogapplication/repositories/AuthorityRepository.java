package com.chrismartain.springbootblogapplication.repositories;

import com.chrismartain.springbootblogapplication.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
