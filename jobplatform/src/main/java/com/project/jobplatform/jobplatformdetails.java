package com.project.jobplatform;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "job_info")
public class jobplatformdetails {
    @Id
    private String jobid;
    private String jobtitle;
    private String jobdept;
    private String jobdiscription;
    public jobplatformdetails() {
    }
    public jobplatformdetails(String jobid, String jobtitle, String jobdept, String jobdiscription) {
        this.jobid = jobid;
        this.jobtitle = jobtitle;
        this.jobdept = jobdept;
        this.jobdiscription = jobdiscription;
    }
    public String getjobid() {
        return jobid;
    }
    public void setjobid(String jobid) {
        this.jobid = jobid;
    }
    public String getjobtitle() {
        return jobtitle;
    }
    public void setjobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }
    public String getjobdept() {
        return jobdept;
    }
    public void setjobdept(String jobdept) {
        this.jobdept = jobdept;
    }
    public String getjobdiscription() {
        return jobdiscription;
    }
    public void setjobdiscription(String jobdiscription) {
        this.jobdiscription = jobdiscription;
    }
}