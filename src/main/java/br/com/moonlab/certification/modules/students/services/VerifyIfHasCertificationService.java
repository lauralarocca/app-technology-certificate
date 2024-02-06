package br.com.moonlab.certification.modules.students.services;

import org.springframework.stereotype.Service;

import br.com.moonlab.certification.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationService {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("laura@moonlab.com.br") && dto.getTechnology().equals("Java")) {
            return true;
        }

        return false;
    }

}
