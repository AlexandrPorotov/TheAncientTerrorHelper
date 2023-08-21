package com.aleksandr.theancientterrorhelper.Repository;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetectiveRepository extends JpaRepository<Detective, Long> {
}
