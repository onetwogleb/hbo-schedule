package com.hbo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowDTO {
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String date;
    @NotNull
    private String trailer;
    @NotNull
    private Long rating;
    private Long genre;
}
