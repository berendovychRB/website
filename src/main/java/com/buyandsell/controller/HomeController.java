package com.buyandsell.controller;

import com.buyandsell.entity.Announcement;
import com.buyandsell.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/")
    public String home(Model model){
        List<Announcement> announcements = announcementService.getAll();
        Collections.reverse(announcements);
        model.addAttribute("announcements",announcements);
        return "home";
    }



}
