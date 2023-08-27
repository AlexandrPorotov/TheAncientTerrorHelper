package com.aleksandr.theancientterrorhelper.Repository;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Abilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AbilitiesRepository extends JpaRepository<Abilities, UUID> {
}
