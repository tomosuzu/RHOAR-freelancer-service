package com.redhat.freelancer.freelancer.rest;

import com.redhat.freelancer.freelancer.model.Freelancer;
import com.redhat.freelancer.freelancer.service.FreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/freelancers")
@Component
public class FreelancerEndpoint {

    @Autowired
    private FreelancerService freelancerService;

    @GET
    @Path("/{freelancerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Freelancer getFreelancer(@PathParam("freelancerId") String freelancerId) {
        return freelancerService.getFreelancer(freelancerId);
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Freelancer> getFreelancers() {
        return freelancerService.getFreelancers();
    }
}
