package com.aleksandr.theancientterrorhelper.Repository;

import com.aleksandr.theancientterrorhelper.Model.Detectiv.Abilities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.server.UID;

public interface AbilitiesRepository extends JpaRepository<Abilities, Long> {
}
