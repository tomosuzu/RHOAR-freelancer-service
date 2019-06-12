package com.redhat.freelancer.freelancer.service;

import com.redhat.freelancer.freelancer.model.Freelancer;

import java.util.List;

public interface FreelancerService {
    public Freelancer getFreelancer(String freelancerId);

    public List<Freelancer> getFreelancers();
}
