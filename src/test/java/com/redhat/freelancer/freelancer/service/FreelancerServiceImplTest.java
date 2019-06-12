package com.redhat.freelancer.freelancer.service;

import com.redhat.freelancer.freelancer.model.Freelancer;
import com.redhat.freelancer.freelancer.repository.FreelancerRepository;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

public class FreelancerServiceImplTest {
    private FreelancerServiceImpl freelancerService;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    FreelancerRepository repository;

    @Before
    public void setup() {
        freelancerService = new FreelancerServiceImpl();
        ReflectionTestUtils.setField(freelancerService, null, repository, FreelancerRepository.class);
    }

    @Test
    public void testGetNoFreelancer() {
        Freelancer fs = freelancerService.getFreelancer("123456");

        assertThat(fs, nullValue());
    }

    @Test
    public void testGetFreelancer() {
        Freelancer freelancer1 = new Freelancer();
        freelancer1.setFreelancerId("123456");
        freelancer1.setFirstName("firstName1");
        freelancer1.setLastName("lastName1");
        freelancer1.setEmailAddress("email1");
        freelancer1.setSkillList("skillList1");
        when(repository.findByFreelancerId("123456")).thenReturn(freelancer1);

        Freelancer fs = freelancerService.getFreelancer("123456");

        assertThat(fs, notNullValue());
        assertThat(fs.getFreelancerId(), equalTo("123456"));
        assertThat(fs.getFirstName(), equalTo("firstName1"));
        assertThat(fs.getLastName(), equalTo("lastName1"));
        assertThat(fs.getEmailAddress(), equalTo("email1"));
        assertThat(fs.getSkillList(), equalTo("skillList1"));
    }

    @Test
    public void testGetNoFreelancers() {
        List<Freelancer> fs = freelancerService.getFreelancers();

        assertThat(fs.size(), equalTo(0));
    }

    @Test
    public void testGetFreelancers() {
        Freelancer freelancer1 = new Freelancer();
        freelancer1.setFreelancerId("123456");
        freelancer1.setFirstName("firstName1");
        freelancer1.setLastName("lastName1");
        freelancer1.setEmailAddress("email1");
        freelancer1.setSkillList("skillList1");
        Freelancer freelancer2 = new Freelancer();
        freelancer2.setFreelancerId("123457");
        freelancer2.setFirstName("firstName2");
        freelancer2.setLastName("lastName2");
        freelancer2.setEmailAddress("email2");
        freelancer2.setSkillList("skillList2");
        List<Freelancer> freelancers = new ArrayList<>();
        freelancers.add(freelancer1);
        freelancers.add(freelancer2);
        when(repository.findAll()).thenReturn(freelancers);

        List<Freelancer> fs = freelancerService.getFreelancers();

        assertThat(fs.size(), equalTo(2));
    }
}
