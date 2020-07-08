package com.buyandsell.controller;

import com.buyandsell.entity.Announcement;
import com.buyandsell.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @GetMapping("/selling")
    public String sell(){
        return "selling";
    }

    @PostMapping("/selling")
    public String tosell(@RequestParam String title,
                         @RequestParam String description){
        if (!title.equals("") && !description.equals("")) {
            Announcement announcement = new Announcement(title,description);
            announcementService.save(announcement);
        }
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") Long id){
        announcementService.delete(id);
        return "redirect:/";
    }


}
