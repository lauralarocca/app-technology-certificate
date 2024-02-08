package br.com.moonlab.certification.modules.certifications.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.moonlab.certification.modules.certifications.services.Top10RankingService;
import br.com.moonlab.certification.modules.students.entities.CertificationStudentEntity;

@RestController
@RequestMapping("/ranking")
public class RankingController {

    @Autowired
    private Top10RankingService top10RankingService;

    @GetMapping("/top10")
    public List<CertificationStudentEntity> top10() {
        return this.top10RankingService.execute();
    }
}
