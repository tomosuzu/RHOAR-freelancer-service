package com.redhat.freelancer.freelancer.repository;

import com.redhat.freelancer.freelancer.model.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer,Integer> {
    Freelancer findByFreelancerId(String freelancerId);
    List<Freelancer> findAll();
}
