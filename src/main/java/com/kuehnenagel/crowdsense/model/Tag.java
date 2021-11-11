package com.kuehnenagel.crowdsense.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;

@Entity
public class Tag {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Column(name = "code")
    private String code;

    @NotNull
    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "application_id")
    private Application application;
}
