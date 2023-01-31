package com.example.boot.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Sector {
   private Long id;
   private String personality;
   private String energy;
   private String  interest;
   private String  health;
   private String  logic;
   private String  labour;
   private String  luck;
   private String  debt;
   private String  memory;
}
