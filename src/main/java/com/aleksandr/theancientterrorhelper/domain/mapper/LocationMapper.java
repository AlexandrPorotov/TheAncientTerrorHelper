package com.aleksandr.theancientterrorhelper.domain.mapper;

import com.aleksandr.theancientterrorhelper.domain.Model.Location.Location;
import com.aleksandr.theancientterrorhelper.domain.dto.Detective.LocationDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LocationMapper extends BiMapper<Location, LocationDTO> {
}
