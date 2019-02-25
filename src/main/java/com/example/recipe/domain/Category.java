package com.example.recipe.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by revin on 16.02.2019.
 */

@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
