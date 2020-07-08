package com.buyandsell.repository;

import com.buyandsell.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
//
//    List<Announcement> findAllByTitleAndDescription(String text);

    List<Announcement> findAllByTitleOrDescriptionContains(String text);
}
