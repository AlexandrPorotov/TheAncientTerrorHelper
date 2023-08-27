package com.aleksandr.theancientterrorhelper.Repository;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DetectiveRepository extends JpaRepository<Detective, UUID> {
}
