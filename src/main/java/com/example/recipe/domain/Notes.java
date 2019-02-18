package com.example.recipe.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by revin on 16.02.2019.
 */

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
