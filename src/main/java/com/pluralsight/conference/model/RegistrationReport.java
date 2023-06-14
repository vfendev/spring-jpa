package com.pluralsight.conference.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AssociationOverride;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationReport {

    private String name;
    private String courseName;
    private String courseDescription;
}
