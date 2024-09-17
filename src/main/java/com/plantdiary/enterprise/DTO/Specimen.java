
package com.plantdiary.enterprise.DTO;

import lombok.Data;

public @Data class Specimen {
    private int PlantId;
    private String SpecimenId;
    private String Latitude;
    private String Longitude;
    private String Description;
}
