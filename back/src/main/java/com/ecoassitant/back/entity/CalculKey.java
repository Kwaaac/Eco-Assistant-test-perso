package com.ecoassitant.back.entity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
public class CalculKey implements Serializable {

    @ManyToOne
    @JoinColumn(name = "calculopid", nullable = false)
    private CalculOperateurEntity calculOp;

    @OneToOne
    @JoinColumn(name = "reponsepossibleid", nullable = false)
    private ReponsePossibleEntity reponsePossible;

}
