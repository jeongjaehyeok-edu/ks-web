package com.jaehyeok.app.controller;

import com.jaehyeok.app.entity.*;
import com.jaehyeok.app.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {
    private final PersonRepository personRepository;
    private final SocialMediaRepository socialMediaRepository;
    private final InterestsRepository interestsRepository;
    private final SkillRepository skillRepository;
    private final WorkRepository workRepository;

    public IndexController(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository) {
        this.personRepository = personRepository;
        this.socialMediaRepository = socialMediaRepository;
        this.interestsRepository = interestsRepository;
        this.skillRepository = skillRepository;
        this.workRepository = workRepository;
    }
/*    @GetMapping("/")
        public String index() {
        return "index";
    } 과제 1*/
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("person", personRepository.findAll().stream().findFirst().orElse(null));
        model.addAttribute("socialMedia", socialMediaRepository.findAll().stream().findFirst().orElse(null));
        model.addAttribute("interests", interestsRepository.findAll());
        model.addAttribute("skills", skillRepository.findAll());
        model.addAttribute("works", workRepository.findAll());
        return "resume";
    }
}