package com.aleksandr.theancientterrorhelper.domain.mapper;

import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import com.aleksandr.theancientterrorhelper.domain.dto.Detective.DetectiveDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DetectiveMapper extends BiMapper<Detective, DetectiveDTO>{
}

