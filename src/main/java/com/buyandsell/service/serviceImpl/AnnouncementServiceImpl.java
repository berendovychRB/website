package com.buyandsell.service.serviceImpl;

import com.buyandsell.entity.Announcement;
import com.buyandsell.repository.AnnouncementRepository;
import com.buyandsell.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

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
    public Set<Announcement> findAllByText(Announcement announcement) {
        String[] arrTitles = announcement.getTitle().split(" ");
        String[] arrDescriptions =  announcement.getDescription().split(" ");
        Set<String> wordsSet = new HashSet(Arrays.asList(arrTitles));
        wordsSet.addAll(Arrays.asList(arrDescriptions));
        Set<Announcement> search = new HashSet<>();
        for (String s : wordsSet){
            search.addAll(announcementRepository.findFirst3ByTitleContainingAndIdNotOrDescriptionContainingAndIdNot(s,announcement.getId(),s,announcement.getId()));
            if (search.size() >= 3) break;
        }
        return search;

    }
}
