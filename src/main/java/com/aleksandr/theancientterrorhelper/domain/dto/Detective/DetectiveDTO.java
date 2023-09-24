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

    @Size(min = 1, message = "The phrase cannot be less than 1")
    @Size(max = 50, message = "The phrase cannot be greater than 200")
    private String phrase;

    @Min(value = 1, message = "The fiscalHealth cannot be less than 1")
    @Max(value = 15, message = "The fiscalHealth cannot be greater than 15")
    private Integer fiscalHealth;

    @Min(value = 1, message = "The mentalHealth cannot be less than 1")
    @Max(value = 15, message = "The mentalHealth cannot be greater than 15")
    private Integer mentalHealth;

    private AbilitiesDTO abilities;

    //another side of card

//    private Location location;
//    private Location currentLocation;

    @Size(min = 1, message = "The startedInventory cannot be less than 1")
    @Size(max = 100, message = "The startedInventory cannot be greater than 100")
    private String startedInventory; //description of stared actives

//    private List<Active> startedActives;
//    private List<Artifact> startedArtifacts;
//    private List<Evidence> startedEvidence;
//    private List<Active> currentActives;
//    private List<Artifact> currentArtifacts;
//    private List<Evidence> currentEvidence;

    @Size(min = 1, message = "The biography cannot be less than 1")
    @Size(max = 500, message = "The biography cannot be greater than 500")
    private String biography;

    @Size(min = 1, message = "The deathDescription cannot be less than 1")
    @Size(max = 500, message = "The deathDescription cannot be greater than 500")
    private String deathDescription;

    @Size(min = 1, message = "The madOffDescription cannot be less than 1")
    @Size(max = 500, message = "The madOffDescription cannot be greater than 500")
    private String madOffDescription;

}
