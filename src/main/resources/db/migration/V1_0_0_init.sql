create table candidate
(
    id         int auto_increment,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    full_name  varchar(255) not null,
    email      varchar(255) not null,
    primary key (id)
);

create table application
(
    id              int auto_increment,
    submission_date date         not null,
    status          varchar(255) not null,
    rating          int,
    comment         varchar(255),
    candidate_id    int          not null,
    primary key (id)
);

create index application_candidate_idx on application (('candidate_id'));

create table tag
(
    id             int auto_increment,
    code           varchar(255) not null,
    application_id int          not null,
    primary key (id)
);

create index tag_application_idx on tag (('application_id'));
