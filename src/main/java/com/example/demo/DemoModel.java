package com.example.demo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class DemoModel {

    @NotBlank
    @Size(max = 100)
    private String name;

    @Size(max = 100)
    private String description;
}
