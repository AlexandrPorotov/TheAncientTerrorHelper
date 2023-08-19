package com.aleksandr.theancientterrorhelper.Repository;

import com.aleksandr.theancientterrorhelper.Model.Detectiv.Detective;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.server.UID;

public interface DetectiveRepository extends JpaRepository<Detective, Long> {
}
