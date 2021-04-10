package com.hbo.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table
public class Genre {
    @Id
    @SequenceGenerator(
            name = "genre_sequence",
            sequenceName = "genre_sequence",
            allocationSize = 1)
    @GeneratedValue(
            generator = "genre_sequence",
            strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    private String name;
}
