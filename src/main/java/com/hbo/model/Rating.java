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
public class Rating {
    @Id
    @SequenceGenerator(
            name = "rating_sequence",
            sequenceName = "rating_sequence",
            allocationSize = 1)
    @GeneratedValue(
            generator = "rating_sequence",
            strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    private String name;
    private String description;
}
