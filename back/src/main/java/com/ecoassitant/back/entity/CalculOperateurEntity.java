package com.ecoassitant.back.entity;

import com.ecoassitant.back.entity.tools.Operator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Calculoperateur")
public class CalculOperateurEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcalculop", nullable = false)
    private Long idCalculOp;

    @Enumerated(EnumType.STRING)
    @Column(name = "operateur")
    private Operator operateur;
}
