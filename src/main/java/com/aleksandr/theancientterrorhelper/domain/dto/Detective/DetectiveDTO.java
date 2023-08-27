package com.aleksandr.theancientterrorhelper.domain.dto.Detective;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.experimental.Accessors;
import jakarta.validation.constraints.Size;

import java.util.UUID;

@Data
@Accessors(chain = true)
public class DetectiveDTO {

    private UUID id;

    @Size(min = 1, message = "The name cannot be less than 1")
    @Size(max = 50, message = "The name cannot be greater than 50")
    private String name;

    @Size(min = 1, message = "The profession cannot be less than 1")
    @Size(max = 50, message = "The profession cannot be greater than 50")
    private String profession;

    @Size(min = 1, message = "The action cannot be less than 1")
    @Size(max = 200, message = "The action cannot be greater than 200")
    private String action;

    @Size(min = 1, message = "The ability cannot be less than 1")
    @Size(max = 200, message = "The ability cannot be greater than 200")
    private String ability;

    @Min(value = 1, message = "The fiscalHealth cannot be less than 1")
    @Max(value = 15, message = "The fiscalHealth cannot be greater than 15")
    private Integer fiscalHealth;
    @Min(value = 1, message = "The mentalHealth cannot be less than 1")
    @Max(value = 15, message = "The mentalHealth cannot be greater than 15")
    private Integer mentalHealth;

    private AbilitiesDTO abilitiesDTO;

}
