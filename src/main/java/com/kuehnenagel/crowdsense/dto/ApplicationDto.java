package com.kuehnenagel.crowdsense.dto;

import com.kuehnenagel.crowdsense.model.Application;
import com.kuehnenagel.crowdsense.model.Candidate;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
public class ApplicationDto {

    private long id;
    private ZonedDateTime submissionDate;
    private String status;
    private String rating;
    private String comment;
    private Candidate candidate;

    public ApplicationDto(Application application) {
        id = application.getId();
        submissionDate = application.getSubmissionDate();
        status = application.getStatus();
        rating = application.getRating();
        comment = application.getComment();
        candidate = application.getCandidate();
    }
}
