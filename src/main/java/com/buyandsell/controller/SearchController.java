package com.buyandsell.controller;

import com.buyandsell.entity.Announcement;
import com.buyandsell.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    public AnnouncementService announcementService;

//    @GetMapping("searchResult")
//    public String result(Model model)

    @PostMapping("/search")
    public String search(@RequestParam String text,
                         Model model){
        List<Announcement> announcements = announcementService.findAllByText(text);
        model.addAttribute("announcements", announcements);
        return "searchResult";
    }

}
