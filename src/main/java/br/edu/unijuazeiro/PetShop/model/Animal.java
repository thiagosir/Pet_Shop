package br.edu.unijuazeiro.PetShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor 
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_animal")
    @SequenceGenerator( sequenceName = "seq_animal", 
                        allocationSize = 1, 
                        initialValue = 1, 
                        name = "gen_animal")
    private Integer codigo;
    private String nome;
    private String raca; 


}