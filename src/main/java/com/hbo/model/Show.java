package com.hbo.model;

import lombok.*;

import javax.persistence.*;


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
    private String name;
    private String date;

    @ManyToOne
    @JoinColumn(name = "rating_id")
    private Rating rating;

    @ManyToOne
    @JoinColumn(name = "genre_id")
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
