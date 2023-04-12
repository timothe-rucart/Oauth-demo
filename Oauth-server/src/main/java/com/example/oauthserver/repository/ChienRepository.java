package com.example.oauthserver.repository;

import com.example.oauthserver.entity.Chien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChienRepository extends JpaRepository<Chien, Long> {
}
