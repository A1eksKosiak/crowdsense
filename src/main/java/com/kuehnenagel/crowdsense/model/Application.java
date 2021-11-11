package com.kuehnenagel.crowdsense.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.ZonedDateTime;

import static javax.persistence.FetchType.EAGER;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@Entity
public class Application {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "submission_date")
    private ZonedDateTime submissionDate;

    @Column(name = "status")
    private String status;

    @Column(name = "rating")
    private String rating;

    @Column(name = "comment")
    private String comment;

    @NotNull
    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

}
