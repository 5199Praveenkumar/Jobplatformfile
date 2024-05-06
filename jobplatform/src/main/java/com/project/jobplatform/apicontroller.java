
package com.project.jobplatform;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobplatform")
public class apicontroller
{
    jobplatformservice service;
    @Autowired
    public apicontroller(jobplatformservice service) {
        this.service = service;
    }
    @GetMapping("{jobid}")//read data for a id from db
    public String getjobplatformdetails(@PathVariable("jobid")String jobid){
        return service.getjobplatform(jobid);    
    }
    @GetMapping//reading all the datas from db
    public List<jobplatformdetails> getalljobplatformdetails(){
        return service.getalljobplatformdetails();    
    }
    @PostMapping
    public String createjobplatform(@RequestBody jobplatformdetails details){
         service.createjobplatform(details);
         return "created successfully";
    }
    @PutMapping
    public String updatejobplatformdetails(@RequestBody jobplatformdetails details){
        service.updatejobplatform(details);
        return"updated scuccessfully";
    }
   
    @DeleteMapping("{jobid}")
    public String deletejobplatformdetails(@PathVariable("jobid") String jobid){
         service.deletejobplatform(jobid);
         return "success";
    }
}