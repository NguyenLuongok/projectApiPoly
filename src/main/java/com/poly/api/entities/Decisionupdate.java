package com.poly.api.entities;

import lombok.Data;

import javax.persistence.*;
/**
 * @author Tong Duy Hai on 05/24/2020.
 * @created 24/05/2020
 * @project PolyProjectApi
 */
@Entity
@Table(name = "decisionupdate")
@Data
public class Decisionupdate {
    @Id
    private int decisionUpdateId;
    private String namePdf;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "decisionDetailId")
    private Desiciondetail desiciondetail;

    public Decisionupdate() {
    }
}
