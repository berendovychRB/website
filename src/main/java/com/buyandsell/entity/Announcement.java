package com.buyandsell.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Announcement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Date date;

    public Announcement() {
    }

    public Announcement(String title, String description) {
        this.title = title;
        this.description = description;
        this.date = new Date();

    }
}
