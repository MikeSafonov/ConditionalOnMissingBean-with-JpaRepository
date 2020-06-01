package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Mike Safonov
 */
@NoRepositoryBean
public interface BaseRepository extends JpaRepository<FileEntity, Long> {

}
