package com.aleksandr.theancientterrorhelper.Services.DetectiveService;

import com.aleksandr.theancientterrorhelper.Exceptions.ResourceAlreadyExistsException;
import com.aleksandr.theancientterrorhelper.Repository.AbilitiesRepository;
import com.aleksandr.theancientterrorhelper.Repository.DetectiveRepository;
import com.aleksandr.theancientterrorhelper.Utils.JsonUtil;
import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Abilities;
import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import com.aleksandr.theancientterrorhelper.domain.dto.Detective.AbilitiesDTO;
import com.aleksandr.theancientterrorhelper.domain.dto.Detective.DetectiveDTO;
import com.aleksandr.theancientterrorhelper.domain.mapper.AbilitiesMapper;
import com.aleksandr.theancientterrorhelper.domain.mapper.DetectiveMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class DetectiveService {

    private final DetectiveRepository detectiveRepository;
    private final AbilitiesRepository abilitiesRepository;
    private final DetectiveMapper detectiveMapper;
    private final AbilitiesMapper abilitiesMapper;

    public Detective saveDetective(DetectiveDTO detectiveDTO){

        if (detectiveRepository.findDetectiveByName(detectiveDTO.getName()).isPresent()) {
            throw new ResourceAlreadyExistsException("Detective with name '" + detectiveDTO.getName() + "' already exists");
        }

        Abilities abilities = abilitiesMapper.from(detectiveDTO.getAbilities());
        abilitiesRepository.save(abilities);
        Detective detective = detectiveMapper.from(detectiveDTO);
        detective.setAbilities(abilities);

        return detectiveRepository.save(detective);

    }

}
