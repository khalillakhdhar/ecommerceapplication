package com.hql.entities;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Adresse extends Audit {
private String rue,  detailles,ville,pays;
private int codepostale;
private double moyenneLocation;
}
