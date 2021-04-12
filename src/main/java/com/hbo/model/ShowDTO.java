package com.hbo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShowDTO {
    private Long id;
    private String name;
    private String date;
    private String trailer;
    private Long rating;
    private Long genre;
}
