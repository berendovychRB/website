package com.buyandsell.controller;

import com.buyandsell.entity.Announcement;
import com.buyandsell.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EditController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable(name = "id") Long id,
                       Model model){
        Announcement announcement = announcementService.getOne(id);
        model.addAttribute("announcement", announcement);
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String toEdit(@PathVariable(name = "id") Long id,
                         @RequestParam String title,
                         @RequestParam String description){
        Announcement announcement = announcementService.getOne(id);
        if (!title.isEmpty()) announcement.setTitle(title);
        if (!description.isEmpty()) announcement.setDescription(description);
        announcementService.save(announcement);
        return "redirect:/";
    }

}
