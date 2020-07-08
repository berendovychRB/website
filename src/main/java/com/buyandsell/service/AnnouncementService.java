package com.buyandsell.service;

import com.buyandsell.entity.Announcement;

import java.util.List;

public interface AnnouncementService {

    Announcement save(Announcement announcement);

    List<Announcement> getAll();

    void delete(Long id);

    Announcement getOne(Long id);

    List<Announcement> findAllByText(String text);

//    Announcement edit(Announcement announcement);

}
