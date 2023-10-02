package com.aleksandr.theancientterrorhelper.Controllers.Detective;

import com.aleksandr.theancientterrorhelper.Services.DetectiveService.DetectiveService;
import com.aleksandr.theancientterrorhelper.Utils.JsonUtil;
import com.aleksandr.theancientterrorhelper.domain.Model.Detectiv.Detective;
import com.aleksandr.theancientterrorhelper.domain.dto.Detective.DetectiveDTO;
import com.aleksandr.theancientterrorhelper.domain.mapper.DetectiveMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/detectives")
@RestController
@RequiredArgsConstructor
@Validated
@Slf4j
public class DetectiveController {

    private final DetectiveService detectiveService;
    private final DetectiveMapper detectiveMapper;

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public ResponseEntity<UUID> createDetective(@RequestBody @Valid DetectiveDTO detectiveDTO){
//        return ResponseEntity.ok(detectiveService.saveDetective(detectiveDTO));
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<DetectiveDTO> createDetective(@RequestBody DetectiveDTO detectiveDTO) {

        log.info("Creating Detective: {}", detectiveDTO);
        Detective createdDetective = detectiveService.saveDetective(detectiveDTO);
        log.info("Created Detective: {}", createdDetective);

        return new ResponseEntity<>(detectiveMapper.to(createdDetective), HttpStatus.CREATED);

    }

    @GetMapping("/{detectiveId}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<DetectiveDTO> getDetectiveById(@PathVariable UUID detectiveId){
        return new ResponseEntity<>(detectiveMapper.to(detectiveService.getDetectiveById(detectiveId)), HttpStatus.OK);
    }

}
