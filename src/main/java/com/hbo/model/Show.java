package com.hbo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table
public class Show {
    @Id
    @SequenceGenerator(
            name = "show_sequence",
            sequenceName = "show_sequence",
            allocationSize = 1)
    @GeneratedValue(
            generator = "show_sequence",
            strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rating_id", nullable = false)
    private Rating rating;

    @ManyToOne(optional = false)
    @JoinColumn(name = "genre_id", nullable = false)
    private Genre genre;

    private String trailer;

    public Show(String name, String date, Rating rating, Genre genre, String trailer) {
        this.name = name;
        this.date = date;
        this.rating = rating;
        this.genre = genre;
        this.trailer = trailer;
    }
}
