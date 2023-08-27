package com.aleksandr.theancientterrorhelper.Controllers.Detective;

import com.aleksandr.theancientterrorhelper.Services.DetectiveService.DetectiveService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/detectives")
@RestController
@RequiredArgsConstructor
@Validated
@Slf4j
public class DetectiveController {

    private final DetectiveService detectiveService;

}
