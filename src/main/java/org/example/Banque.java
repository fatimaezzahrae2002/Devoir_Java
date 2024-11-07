package org.example;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Banque {
    private String id;
    private String pays;
    private List<Compte> comptes;
}
