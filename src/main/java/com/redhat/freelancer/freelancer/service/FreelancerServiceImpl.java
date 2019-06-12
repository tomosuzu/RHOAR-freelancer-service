package com.redhat.freelancer.freelancer.service;

import com.redhat.freelancer.freelancer.model.Freelancer;
import com.redhat.freelancer.freelancer.repository.FreelancerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FreelancerServiceImpl implements FreelancerService {
    @Autowired
    FreelancerRepository repository;

    public Freelancer getFreelancer(String freelancerId){
        return repository.findByFreelancerId(freelancerId);
    }

    public List<Freelancer> getFreelancers(){
        return repository.findAll();
    }
}
