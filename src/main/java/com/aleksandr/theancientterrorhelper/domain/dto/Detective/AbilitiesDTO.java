package com.aleksandr.theancientterrorhelper.domain.dto.Detective;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.UUID;

@Data
@Accessors(chain = true)
public class AbilitiesDTO {

    private UUID id;

    @Min(value = 1, message = "The knowledge cannot be less than 1")
    @Max(value = 15, message = "The knowledge cannot be greater than 15")
    private Integer knowledge;

    @Min(value = 1, message = "The communication cannot be less than 1")
    @Max(value = 15, message = "The communication cannot be greater than 15")
    private Integer communication;

    @Min(value = 1, message = "The attention cannot be less than 1")
    @Max(value = 15, message = "The attention cannot be greater than 15")
    private Integer attention;

    @Min(value = 1, message = "The force cannot be less than 1")
    @Max(value = 15, message = "The force cannot be greater than 15")
    private Integer force;

    @Min(value = 1, message = "The will cannot be less than 1")
    @Max(value = 15, message = "The will cannot be greater than 15")
    private Integer will;

}
