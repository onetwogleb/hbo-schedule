package com.hbo.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Rating {
    private Long id;
    private String name;
    private String description;
}
