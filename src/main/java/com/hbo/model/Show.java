package com.hbo.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Show {
    private Long id;
    private String name;
    private String date;
    private String rating;
    private String genre;
    private String trailer;
}
