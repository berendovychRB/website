package com.buyandsell.service.serviceImpl;

import com.buyandsell.entity.Announcement;
import com.buyandsell.repository.AnnouncementRepository;
import com.buyandsell.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

    @Autowired
    private AnnouncementRepository announcementRepository;

    @Override
    public Announcement save(Announcement announcement) {
        return announcementRepository.save(announcement);
    }

    @Override
    public List<Announcement> getAll() {
        return announcementRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        announcementRepository.deleteById(id);
    }

    @Override
    public Announcement getOne(Long id) {
        return announcementRepository.getOne(id);
    }

    @Override
    public List<Announcement> findAllByText(String text) {
        return announcementRepository.findAllByTitleOrDescriptionContains(text);
    }
}