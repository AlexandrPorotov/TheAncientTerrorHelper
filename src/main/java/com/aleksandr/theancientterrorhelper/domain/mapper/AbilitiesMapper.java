package com.aleksandr.theancientterrorhelper.domain.mapper;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Abilities;
import com.aleksandr.theancientterrorhelper.domain.dto.Detective.AbilitiesDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AbilitiesMapper extends BiMapper<Abilities, AbilitiesDTO> {
}
