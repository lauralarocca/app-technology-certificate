package br.com.moonlab.certification.modules.students.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.moonlab.certification.modules.students.dto.VerifyHasCertificationDTO;
import br.com.moonlab.certification.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationService {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public boolean execute(VerifyHasCertificationDTO dto) {
        var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(),
                dto.getTechnology());
        if (!result.isEmpty()) {
            return true;
        }

        return false;
    }

}
