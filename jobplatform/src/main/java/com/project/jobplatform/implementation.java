package com.project.jobplatform;



import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class implementation implements jobplatformservice {
    repo r;
    public implementation(repo r) {
        this.r = r;
    }

    @Override
    public String createjobplatform(jobplatformdetails details) {
        // TODO Auto-generated method stub
        r.save(details);
        return "success";
        //throw new UnsupportedOperationException("Unimplemented method 'createcustomerdetails'");
    }

    @Override
    public String updatejobplatform(jobplatformdetails details) {
        r.save(details);
        return"success";
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updatecustomerdetails'");
    }

    @Override
    public String getjobplatform(String jobid)
     {
        r.findById(jobid).get();
        return "success";
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getcustomerdetails'");
    }

    @Override
    public  String deletejobplatform(String jobid) {
        r.deleteById(jobid);
        return "success";
        // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'deletecustomerdetails'");
    }

    @Override
    public List<jobplatformdetails> getalljobplatformdetails() {
        return r.findAll();
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getallcustomerdetails'");
    }
    
}
