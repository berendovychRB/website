package com.buyandsell.repository;

import com.buyandsell.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
//
//    List<Announcement> findAllByTitleAndDescription(String text);

//    List<Announcement> findAllByTitleOrDescriptionContains(String text);

//    List<Announcement> findAllByTitleAndDescriptionLike(String text, String s);

//    List<Announcement> findFirst3ByTitleLikeAndDescriptionLike(String text, String text1);

    List<Announcement> findFirst3ByTitleLikeAndDescriptionLikeAndIdNot(Long id,Set<String> s, Set<String> s1);
}
