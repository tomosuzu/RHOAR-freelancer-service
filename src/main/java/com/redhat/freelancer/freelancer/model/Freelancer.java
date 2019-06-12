package com.redhat.freelancer.freelancer.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product_freelancer")
public class Freelancer implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "freelancerid")
    private String freelancerId;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "emailaddress")
    private String emailAddress;
    @Column(name = "skilllist")
    private String skillList;

    public Freelancer() {
    }

    public void setFreelancerId(String freelancerId) {
        this.freelancerId = freelancerId;
    }

    public String getFreelancerId() {
        return freelancerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getSkillList() {
        return skillList;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setSkillList(String skillList) {
        this.skillList = skillList;
    }
}
