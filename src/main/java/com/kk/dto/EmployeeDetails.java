package com.kk.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public record EmployeeDetails(

        int id,
        String firstName,
        String lastName,
        String organization
) {
}
