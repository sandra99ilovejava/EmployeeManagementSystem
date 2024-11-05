package com.business.employee.service.dto;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.NotNull;

@Getter
@Setter
public class EmployeeRequest {
    @NotNull
    private String name;
    @NotNull
    private int age;
}
