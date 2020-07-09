package com.buyandsell.service;

import com.buyandsell.entity.Announcement;

import java.util.List;
import java.util.Set;

public interface AnnouncementService {

    Announcement save(Announcement announcement);

    List<Announcement> getAll();

    void delete(Long id);

    Announcement getOne(Long id);

    List<Announcement> findAllByText(Announcement announcement);

//    Announcement edit(Announcement announcement);

}
