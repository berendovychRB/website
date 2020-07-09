package com.buyandsell.controller;

import com.buyandsell.entity.Announcement;
import com.buyandsell.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Set;

@Controller
public class ViewController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/view/{id}")
    public String view(@PathVariable(name = "id") Long id,
                       Model model){
        Announcement announcement = announcementService.getOne(id);
        model.addAttribute("announcement",announcement);
        Set<Announcement> announcements = announcementService.findAllByText(announcement);
        model.addAttribute("announcements", announcements);
        return "view";
    }

}
