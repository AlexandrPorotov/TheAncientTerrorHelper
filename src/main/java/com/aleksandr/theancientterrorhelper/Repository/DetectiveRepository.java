package com.aleksandr.theancientterrorhelper.Repository;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DetectiveRepository extends JpaRepository<Detective, UUID> {

    @Query("SELECT detective FROM Detective detective WHERE detective.name = ?1")
    Optional<Detective> findDetectiveByName(String name);
}
